package com.fanzy.project.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fanzy.lingdongapicommon.model.entity.InterfaceInfo;
import com.fanzy.lingdongapicommon.model.entity.UserInterfaceInfo;
import com.fanzy.project.annotation.AuthCheck;
import com.fanzy.project.common.BaseResponse;
import com.fanzy.project.common.ErrorCode;
import com.fanzy.project.common.ResultUtils;
import com.fanzy.project.exception.BusinessException;
import com.fanzy.project.mapper.UserInterfaceInfoMapper;
import com.fanzy.project.model.vo.InterfaceInfoVO;
import com.fanzy.project.service.InterfaceInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 接口调用次数分析
 *
 * @author yupi
 */
@RestController
@RequestMapping("/analysis")
@Slf4j
public class AnalysisController {

    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @GetMapping("/top/interface/invoke")
    @AuthCheck(mustRole = "admin")
    public BaseResponse<List<InterfaceInfoVO>> listTopInvokeInterfaceInfo(){
        List<UserInterfaceInfo> userInterfaceInfoList = userInterfaceInfoMapper.listTopInvokeInterfaceInfo(3);
        // Java 8 的流（Stream）是对集合数据进行操作和处理的一种高级方式。它提供了一种声明式的、函数式编程的风格，使代码更简洁、更具表达力。
        Map<Long, List<UserInterfaceInfo>> interfaceInfoIdObjMap = userInterfaceInfoList.stream()
                .collect(Collectors.groupingBy(UserInterfaceInfo::getInterfaceInfoId));
        // 数据库通过InterfaceId查询
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", interfaceInfoIdObjMap.keySet());
        List<InterfaceInfo> list = interfaceInfoService.list(queryWrapper);
        if (CollectionUtils.isEmpty(list)){
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }
        // 使用流操作将list中的每个InterfaceInfo对象转换为InterfaceInfoVO对象。
        List<InterfaceInfoVO> interfaceInfoVOList = list.stream().map(interfaceInfo -> {
            InterfaceInfoVO interfaceInfoVO = new InterfaceInfoVO();
            BeanUtils.copyProperties(interfaceInfo, interfaceInfoVO); // 复制属性
            int totalNum = interfaceInfoIdObjMap.get(interfaceInfo.getId()).get(0).getTotalNum(); //从interfaceInfoIdObjMap中获取totalNum
            interfaceInfoVO.setTotalNum(totalNum);
            return interfaceInfoVO;
        }).collect(Collectors.toList());
        return ResultUtils.success(interfaceInfoVOList);
    }
}
