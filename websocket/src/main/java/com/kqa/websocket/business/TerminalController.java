package com.kqa.websocket.business;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yeauty.pojo.Session;

/**
 * 终端控制器
 */
public class TerminalController {


    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(TerminalController.class);

    /**
     * Websocket
     */
    private Session session;


    public TerminalController(Session session) {
        this.session = session;
    }


    /**
     * 关闭连接
     */
    public void closeSession(){
        if(session!=null){
            session.closeFuture();
        }
    }


    /**
     * 处理消息
     * @param msg Json数据包
     */
    public void processMessage(String msg) {
        sendMessage(msg);
    }

    /**
     * 发送数据
     * @param msg
     */
    private void sendMessage(String msg){
        if (session != null) {
            session.sendText(msg);
        }
    }



}
