package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.EntranceData;
import com.kqa.websocket.mapper.EntranceDataMapper;
import com.kqa.websocket.service.IEntranceDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 门禁刷卡数据表 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class EntranceDataServiceImpl extends ServiceImpl<EntranceDataMapper, EntranceData> implements IEntranceDataService {

}
