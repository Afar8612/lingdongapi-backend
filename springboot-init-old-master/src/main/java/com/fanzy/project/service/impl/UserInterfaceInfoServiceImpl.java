package com.fanzy.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanzy.project.common.ErrorCode;
import com.fanzy.project.exception.BusinessException;
import com.fanzy.project.model.entity.UserInterfaceInfo;
import com.fanzy.project.service.UserInterfaceInfoService;
import com.fanzy.project.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author Administrator
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-08-08 14:36:33
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {


    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        Long userId = userInterfaceInfo.getUserId();
        Long interfaceId = userInterfaceInfo.getInterfaceId();
        Integer leftNum = userInterfaceInfo.getLeftNum();


        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建时，所有参数必须非空
        if (add) {
            if (interfaceId <= 0 || userId <= 0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口或用户不存在");
            }
        }
        if (leftNum < 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不能小于 0");
        }

    }

    @Override
    @Transactional
    public boolean invokeCount(long interfaceInfoId, long userId) {
        //判断
        if(interfaceInfoId <= 0 || userId <= 0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口id或用户id不合法");
        }
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("interfaceInfoId", interfaceInfoId);
        updateWrapper.eq("userId", userId);
        // updateWrapper.gt("leftNum", 0);
        updateWrapper.setSql("leftNum = leftNum - 1, totalNum = totalNum + 1");
        return this.update(updateWrapper);
    }
}




