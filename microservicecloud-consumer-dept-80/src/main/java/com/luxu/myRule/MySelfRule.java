package com.luxu.myRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {
	@Bean
    public IRule myRule() {
//    	return new RoundRobinRule();//用随机算法代替某人的轮询
//    	return new RandomRule();//用随机算法代替某人的轮询
    	return new RandomRule_LX();//自定义的负载均衡算法
    }

}
