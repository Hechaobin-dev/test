package com.kqa.websocket.controller;



import com.kqa.websocket.entity.UnitInfo;
import com.kqa.websocket.service.IUnitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HomeController {



//    @Autowired
//    private IUnitInfoService unitInfoService;


    @GetMapping(value = "/")
    public String index() throws Exception {


//            UnitInfo data = new UnitInfo();
//            data.setDeleteCycle(2);
//            data.setFax("test1");
//            data.setIdxUnitGuid(UUID.randomUUID().toString());
//            data.setLinkMan("测试工具2");
//            data.setUnitAddress("测试地址2");
//            data.setUnitCode("00133");
//            data.setUnitName("测试单元");
//            data.setWebsite("www.baidu.com11");
//            data.setWorkPhoneNumber("0751-881928111");
//
//
//           unitInfoService.save(data);
            return  "successful";

        //return  "hello,world";
    }
}
