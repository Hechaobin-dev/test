package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.CardLoss;
import com.kqa.websocket.mapper.CardLossMapper;
import com.kqa.websocket.service.ICardLossService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 挂失信息表 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class CardLossServiceImpl extends ServiceImpl<CardLossMapper, CardLoss> implements ICardLossService {

}
