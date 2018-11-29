package com.kqa.websocket.components;


import com.kqa.websocket.business.TerminalController;
import io.netty.handler.codec.http.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.yeauty.annotation.*;
import org.yeauty.pojo.ParameterMap;
import org.yeauty.pojo.Session;


import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * WebScoket 终端
 */
@ServerEndpoint(prefix = "card-socket")
@Component
public class CardEndPoint {


    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(CardEndPoint.class);

    /**
     * 客户端列表
     */
    private Map<String, TerminalController> clients = new ConcurrentHashMap<>();


    @OnOpen
    public void onOpen(Session session, HttpHeaders headers, ParameterMap parameterMap) throws IOException {


        try {
            if (!clients.containsKey(session.id().asShortText())) {
                clients.put(session.id().asShortText(), new TerminalController(session));
            }
        }catch (Exception ex){
            logger.error("--WebSocket onOpen " + ex.getMessage());
        }


    }

    @OnClose
    public void onClose(Session session) throws IOException {

        try {
            String key = session.id().asShortText();
            if (!clients.containsKey(key)) {

                clients.get(key).closeSession();
            }
        }catch (Exception ex){
          logger.error("--WebSocket onClose " + ex.getMessage());
        }

    }

    @OnError
    public void onError(Session session, Throwable throwable) {

        logger.error("--WebSocket onError " + throwable.getMessage());

    }


    @OnMessage
    public void onMessage(Session session, String message) {

        try {
            String key = session.id().asShortText();
            if (clients.containsKey(key)) {
                clients.get(key).processMessage(message);
            }
        }catch (Exception ex){
            logger.error("--WebSocket onMessage " + ex.getMessage());
        }

    }

    @OnBinary
    public void onBinary(Session session, byte[] bytes) {

//        session.sendBinary(bytes);

    }

    @OnEvent
    public void onEvent(Session session, Object evt) {
//        if (evt instanceof IdleStateEvent) {
//            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
//            switch (idleStateEvent.state()) {
//                case READER_IDLE:
//                    System.out.println("read idle");
//                    break;
//                case WRITER_IDLE:
//                    System.out.println("write idle");
//                    break;
//                case ALL_IDLE:
//                    System.out.println("all idle");
//                    break;
//                default:
//                    break;
//            }
//        }
    }
}
