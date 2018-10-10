package com.fnl.ssmDemo.service.impl;

import com.fnl.ssmDemo.dao.mapper.UserInfoMapper;
import com.fnl.ssmDemo.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserInfoServiceImpl
 * @Description TODO
 * @Author dengcheng
 * @Date 2018/10/10 0010 上午 10:27
 **/
@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {
    @Resource
    UserInfoMapper userInfoMapper;
}
