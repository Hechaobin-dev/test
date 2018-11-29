package com.kqa.websocket.business.dataprocess;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class CmdTypeFactory implements ApplicationContextAware {


    private static Map<CmdType, ICmdService> beanMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, ICmdService> map = applicationContext.getBeansOfType(ICmdService.class);
        beanMap = new HashMap<>();
        map.forEach((k,v)->{
            beanMap.put(v.getCmdType(), v);
        });
    }


    public static <T extends ICmdService> T getTrafficMode(CmdType code) {
        return (T)beanMap.get(code);
    }

}
