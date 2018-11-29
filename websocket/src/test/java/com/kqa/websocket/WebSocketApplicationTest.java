package com.kqa.websocket;



import com.kqa.websocket.business.dataprocess.CmdType;
import com.kqa.websocket.business.dataprocess.CmdTypeFactory;
import com.kqa.websocket.business.dataprocess.ICmdService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WebSocketApplicationTest {




    @Test
    public void testAdd(){


//      ICmdService service =   CmdTypeFactory.getTrafficMode(CmdType.CMD_ANSER_01);

//       Assert.assertEquals(100, service.add(50,50));
    }


//    @Autowired
//    private IUnitInfoService service;
//
//    @Test
//    public void unitInfoTest(){
//
//         UnitInfo data =  new UnitInfo();
//         data.setDeleteCycle(1);
//         data.setFax("站点1");
//         data.setIdxUnitGuid(UUID.randomUUID().toString());
//         data.setLinkMan("测试工具");
//         data.setUnitAddress("测试地址");
//         data.setUnitCode("001");
//         data.setUnitName("测试单元");
//         data.setWebsite("www.baidu.com");
//         data.setWorkPhoneNumber("0751-88192811");
//
//
//        Assert.assertEquals(true, service.save(data));
//
////        UnitInfo data =  new UnitInfo();
//        data.setDeleteCycle(1);
//        data.setFax("020");
//        data.setIdxUnitGuid(UUID.randomUUID().toString());
//        data.setLinkMan("张三");
//        data.setUnitAddress("韶关市妇幼保建议");
//        data.setUnitCode("002");
//        data.setUnitName("韶关市第一中学");
//        data.setWebsite("www.baidu.com");
//        data.setWorkPhoneNumber("0751-888888");
//        data.setPkUnitId(2);
////
////
////
////
//        Assert.assertEquals(true, service.updateById(data));
////
////
////        Assert.assertEquals(true,service.removeById(3));
//    }

//
//    @Test
//    public void updateUnitInfoTest(){
//
//    }
//
//
//    @Test
//    public void deleteUnitInfoTest(){
//
//    }


}
