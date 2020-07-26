package com.zenghm.spring.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create date:20/7/26.
 * Created by: zhm.
 * Class name:HelloController.
 */
@RestController
public class HelloController {
    @Autowired
    private ConfigValueTestObj configValueTestObj;
    @GetMapping("/getName")
    String getName(){
        return configValueTestObj.getName();
    }


}
