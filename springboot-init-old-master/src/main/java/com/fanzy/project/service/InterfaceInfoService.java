package com.fanzy.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fanzy.lingdongapicommon.model.entity.InterfaceInfo;

/**
* @author Administrator
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-08-05 20:27:08
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
