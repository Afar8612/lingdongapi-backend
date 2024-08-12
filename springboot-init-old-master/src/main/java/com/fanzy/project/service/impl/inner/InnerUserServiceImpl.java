package com.fanzy.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fanzy.lingdongapicommon.model.entity.User;
import com.fanzy.lingdongapicommon.service.InnerUserService;
import com.fanzy.project.common.ErrorCode;
import com.fanzy.project.exception.BusinessException;
import com.fanzy.project.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if(StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        return userMapper.selectOne(queryWrapper);
    }


}
