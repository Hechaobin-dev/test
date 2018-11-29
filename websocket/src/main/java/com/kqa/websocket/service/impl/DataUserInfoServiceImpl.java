package com.kqa.websocket.service.impl;

import com.kqa.websocket.entity.DataUserInfo;
import com.kqa.websocket.mapper.DataUserInfoMapper;
import com.kqa.websocket.service.IDataUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 人事资料 服务实现类
 * </p>
 *
 * @author tg
 * @since 2018-11-28
 */
@Service
public class DataUserInfoServiceImpl extends ServiceImpl<DataUserInfoMapper, DataUserInfo> implements IDataUserInfoService {

}
