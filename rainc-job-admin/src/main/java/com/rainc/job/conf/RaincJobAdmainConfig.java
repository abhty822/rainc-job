package com.rainc.job.conf;

import com.rainc.job.core.rpc.client.NettyClient;
import com.rainc.job.core.rpc.factory.RpcInvokerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author rainc
 * @create 2020/10/21 19:05
 */
@Configuration
public class RaincJobAdmainConfig implements InitializingBean, DisposableBean {
    private static RaincJobAdmainConfig admainConfig;

    @Bean
    public RpcInvokerFactory rpcInvokerFactory() {
        RpcInvokerFactory rpcInvokerFactory = new RpcInvokerFactory();
        rpcInvokerFactory.setHost(host);
        rpcInvokerFactory.setPort(port);
        return rpcInvokerFactory;
    }

    public static RaincJobAdmainConfig getAdmainConfig() {
        return admainConfig;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        admainConfig = this;
    }

    @Override
    public void destroy() throws Exception {

    }


    //-------------------------------------conf-----------------------


    @Value("${rainc.job.host}")
    private String host;
    @Value("${rainc.job.port}")
    private int port;

    public int getPort() {
        return port < 7000 ? 7000 : port;
    }

    public String getHost() {
        return host;
    }
}
