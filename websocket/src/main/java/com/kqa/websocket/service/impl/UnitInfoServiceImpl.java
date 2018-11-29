package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.UnitInfo;
import com.kqa.websocket.mapper.UnitInfoMapper;
import com.kqa.websocket.service.IUnitInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学校资料/单位资料 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class UnitInfoServiceImpl extends ServiceImpl<UnitInfoMapper, UnitInfo> implements IUnitInfoService {

}
