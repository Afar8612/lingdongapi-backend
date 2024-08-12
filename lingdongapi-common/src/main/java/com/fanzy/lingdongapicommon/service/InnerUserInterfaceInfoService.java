package com.fanzy.lingdongapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.fanzy.lingdongapicommon.model.entity.UserInterfaceInfo;

/**
* @author Administrator
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-08-08 14:36:33
*/
public interface InnerUserInterfaceInfoService {
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
