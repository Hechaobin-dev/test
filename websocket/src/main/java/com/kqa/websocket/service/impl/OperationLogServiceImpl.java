package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.OperationLog;
import com.kqa.websocket.mapper.OperationLogMapper;
import com.kqa.websocket.service.IOperationLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 终端用户操作日志 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
