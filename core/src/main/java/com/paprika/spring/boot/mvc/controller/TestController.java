package com.paprika.spring.boot.mvc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Api(value = "/test", description = "接口测试", tags = "TestController")
@RestController
public class TestController {
    @ApiOperation(value="访问控制器")
    @GetMapping("/hello")
    public String echo(@RequestParam @ApiParam(name = "str", value = "前端传入的参数") String str) {
        log.info("收到请求：{}", str);
        return str;
    }
}