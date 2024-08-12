package com.fanzy.lingdongapiinterface;

import com.fanzy.lingdongapiclientsdk.client.LingDongApiClient;
import com.fanzy.lingdongapiclientsdk.model.User;


import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class LingdongapiInterfaceApplicationTests {

    @Resource
    private LingDongApiClient lingDongApiClient;

    @Test
    void getUsernameByPostTest(){
        String result = lingDongApiClient.getNameByGet("fanzy");
        User user = new User();
        user.setUsername("fanfan");
        String usernameByPost = lingDongApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
