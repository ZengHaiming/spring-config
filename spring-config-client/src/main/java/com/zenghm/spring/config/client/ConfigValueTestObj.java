package com.zenghm.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Create date:20/7/26.
 * Created by: zhm.
 * Class name:ConfigValueTestObj.
 */
@Component
//动态配置bean属性
@RefreshScope
public class ConfigValueTestObj {
    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
