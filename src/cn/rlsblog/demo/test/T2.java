package cn.rlsblog.demo.test;
/**
 * Author: 973969022@qq.com
 * Date: 2024/4/30 19:54
 */
import cn.rlsblog.demo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//测试类
public class T2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext sc = new
                ClassPathXmlApplicationContext("SpringConfig.xml");
        Student s1 = sc.getBean("stu", Student.class);
        s1.attendclass();
    }

}
