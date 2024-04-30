package cn.rlsblog.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Advice {
    //增强方法
    @Before("cn.rlsblog.demo.Student.attendclass()")
    public String beforeOut(){
        System.out.println("已到教室、完成签到");
        return "已到教室、完成签到";
    }

}
