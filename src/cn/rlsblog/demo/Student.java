package cn.rlsblog.demo;
/**
 * Author: 973969022@qq.com
 * Date: 2024/4/30 19:54
 */
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;
@Repository
public class Student {
    private String sno;
    private String sname;
    private int sage;
    private String ssex;
    //Setters & Getters
    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getSage() {
        return sage;
    }
    public void setSage(int sage) {
        this.sage = sage;
    }
    public String getSsex() {
        return ssex;
    }
    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
    //Method 使用切入点注解
    @Pointcut("execution(* cn.rlsblog.demo.Student.attendclass())")
    public String attendclass(){
        System.out.println(this.sname + "正在上课中");
        return this.sname + "正在上课中";
    }

}