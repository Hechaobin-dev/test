package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.StationInfo;
import com.kqa.websocket.mapper.StationInfoMapper;
import com.kqa.websocket.service.IStationInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 站点信息 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class StationInfoServiceImpl extends ServiceImpl<StationInfoMapper, StationInfo> implements IStationInfoService {

}
