package myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule();//默认轮询算法，自定义随机算法
        return new Rule_CY();   //自定义负载均衡算法，每台服务器访问3次
    }
}
