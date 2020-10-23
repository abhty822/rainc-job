package com.rainc.job.service;



import com.rainc.job.core.rpc.annotation.RaincRpcService;
import com.rainc.job.entity.Student;
import org.springframework.stereotype.Service;

/**
 * @Author rainc
 * @create 2020/10/18 11:27
 */
@Service
@RaincRpcService
public class HelloServiceImpl implements HelloService {
    @Override
    public String helloService(String parm) {
        System.out.println("收到" + parm);
        return "已收到" + parm;
    }

    @Override
    public Student student(Student student) {
        System.out.println("学生是" + student);
        return student;
    }
}
