package com.rainc.job.conf;

import com.rainc.job.core.rpc.factory.RpcProviderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author rainc
 * @create 2020/10/21 19:20
 */
@Configuration
public class RaincJobExecutorConfig {
    @Bean
    public RpcProviderFactory rpcProviderFactory() {
        return new RpcProviderFactory();
    }
}
