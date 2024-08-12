package com.fanzy.lingdongapiclientsdk;

import com.fanzy.lingdongapiclientsdk.client.LingDongApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("lingdongapi.client")
@Data
@ComponentScan
public class LingDongApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public LingDongApiClient lingDongApiClient(){
        return new LingDongApiClient(accessKey, secretKey);
    }
}
