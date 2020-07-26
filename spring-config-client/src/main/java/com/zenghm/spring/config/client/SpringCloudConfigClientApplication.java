package com.zenghm.spring.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Set;

/**
 * Create date:20/7/26.
 * Created by: zhm.
 * Class name:SpringCloudConfigClientApplication.
 */
@SpringBootApplication
public class SpringCloudConfigClientApplication {

    @Autowired
    private ContextRefresher contextRefresher;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class, args);
    }

    /**
     * 定时刷新 config 配置信息
     * 项目启动之后每三秒刷新一次配置信息
     */
    @Scheduled(fixedRate = 3000,initialDelay = 5000)
    public void doRefreshConfig(){
        Set<String> keys = contextRefresher.refresh();
        for (String key:keys) {
            System.out.printf(Thread.currentThread()+"配置信息更新的内容：key[%s]\n",key);
        }
    }
}
