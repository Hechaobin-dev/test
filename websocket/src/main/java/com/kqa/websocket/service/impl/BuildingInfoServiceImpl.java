package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.BuildingInfo;
import com.kqa.websocket.mapper.BuildingInfoMapper;
import com.kqa.websocket.service.IBuildingInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 楼栋资料 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class BuildingInfoServiceImpl extends ServiceImpl<BuildingInfoMapper, BuildingInfo> implements IBuildingInfoService {

}
