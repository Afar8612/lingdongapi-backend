package com.fanzy.lingdongapiinterface.controller;

import com.fanzy.lingdongapiclientsdk.model.User;
import com.fanzy.lingdongapiclientsdk.utils.SignUtils;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * 名称API
 *
 * @author fanzy
 *
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request){
        System.out.println(request.getHeader("yupi"));
        return "Get 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name, HttpServletRequest httpServletRequest){
        System.out.println(httpServletRequest.getHeader("fanzy"));
        return "Post 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        // todo 实际情况应该是去数据库中查是否已分配给用户
//        if (!accessKey.equals("fanzy") ){
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 10000){
//            throw new RuntimeException("无权限");
//        }
//        // todo 时间和当前时间不超过5分钟
////        if (timestamp){}
//
//        // todo 实际情况中是从数据库中查出secretKey
//        String serverSign = SignUtils.genSign(body, "123fanfan");//secretKey = "123fanfan"
//        if(!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }
        String result = "Post 你的名字是" + user.getUsername();
        // todo 调用成功次数+1


        return result;
    }
}
