package com.fanzy.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fanzy.lingdongapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Administrator
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-08-08 14:36:33
* @Entity com.yupi.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    //select interfaceInfoId , sum(totalNum) as totalnum
    //from user_interface_info
    //group by interfaceInfoId
    //order by totalnum desc
    //limit 3
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




