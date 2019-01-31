package com.platform.auth.resource;

import com.platform.auth.pojo.RequestDemo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

@RequestMapping("open/auth")
@RestController
@Api(tags = "测试 Api")
public class ExampleController {

    @RequestMapping(method = RequestMethod.POST, value = "/example")
    @ResponseBody
    public String saveJson(@ModelAttribute RequestDemo requestDemo) throws Exception {

        return null;
    }
}