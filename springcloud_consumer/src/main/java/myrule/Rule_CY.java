package myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;

public class Rule_CY extends AbstractLoadBalancerRule {

    private int total = 0;              //总共被调用的次数
    private int currentIndex = 0;   //当前提供服务的机器号

    //total = 0   当total==5时，指针向下走
    //index = 0.   当前提供服务的机器
    public Server choose(Object key, ILoadBalancer lb) {
        if(lb == null)
            return null;
        Server server = null;
        while (server == null){
            if(Thread.interrupted()){
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if(serverCount == 0)
                return null;
            if(total<3){
                server = upList.get(currentIndex);
                total ++;
            }else {
                total = 0;
                currentIndex++;
                if(currentIndex>=upList.size())
                    currentIndex = 0;
            }
            if(server == null){
                Thread.yield();
                continue;
            }
            if(server.isAlive())
                return server;
            server = null;
            Thread.yield();
        }
        return server;
    }


    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        return choose(o,getLoadBalancer());
    }
}
