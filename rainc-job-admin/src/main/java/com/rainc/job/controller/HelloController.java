package com.rainc.job.controller;

import com.rainc.job.core.rpc.annotation.RaincRpcReference;
import com.rainc.job.entity.Student;
import com.rainc.job.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author rainc
 * @create 2020/10/18 15:01
 */
@RestController
public class HelloController {
    @RaincRpcReference
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(Student student) {
        return helloService.student(student).toString();
    }
}
