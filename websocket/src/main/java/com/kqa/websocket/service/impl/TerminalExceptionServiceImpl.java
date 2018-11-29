package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.TerminalException;
import com.kqa.websocket.mapper.TerminalExceptionMapper;
import com.kqa.websocket.service.ITerminalExceptionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 设备异常状态 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class TerminalExceptionServiceImpl extends ServiceImpl<TerminalExceptionMapper, TerminalException> implements ITerminalExceptionService {

}
