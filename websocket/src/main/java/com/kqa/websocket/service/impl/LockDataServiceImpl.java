package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.LockData;
import com.kqa.websocket.mapper.LockDataMapper;
import com.kqa.websocket.service.ILockDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 门锁刷卡数据表 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class LockDataServiceImpl extends ServiceImpl<LockDataMapper, LockData> implements ILockDataService {

}
