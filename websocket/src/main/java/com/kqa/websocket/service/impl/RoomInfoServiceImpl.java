package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.RoomInfo;
import com.kqa.websocket.mapper.RoomInfoMapper;
import com.kqa.websocket.service.IRoomInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 房间信息 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo> implements IRoomInfoService {

}
