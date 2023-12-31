package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean
{
    @Bean
    @LoadBalanced//Spring Cloud Ribbon 是基于Netflix实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate()
    {
         return new RestTemplate();
    }
    //启用随机算法
    @Bean
    public IRule myRule(){
        return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
    }
}