package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.MiddlewareInfo;
import com.kqa.websocket.mapper.MiddlewareInfoMapper;
import com.kqa.websocket.service.IMiddlewareInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 中间件信息 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class MiddlewareInfoServiceImpl extends ServiceImpl<MiddlewareInfoMapper, MiddlewareInfo> implements IMiddlewareInfoService {

}
