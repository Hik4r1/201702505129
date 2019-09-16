package jojo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Scanner;

public class gy extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);


    }
    public static void main(String[] args) {
        System.out.println("请输入用户名");
        Scanner sc  = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入密码");
        String psw  = sc.nextLine();
        sc.close();
        gg cd = new gg(name,psw);
        boolean bo = cd.check();
        if(bo){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败:提示 用户名 admin 密码123");
        }
    }
}
