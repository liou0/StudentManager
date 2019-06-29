package com.neuedu.a;

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

import javax.xml.ws.Response;
import java.util.Scanner;

public class Admin {
  public static void main(String[] args) {
    String  usreName="刘斌";
    String  passWord="123";
    String name=null,pass=null;
    int num=0;
    Scanner scanner=new Scanner(System.in);
    while (num<3){
      System.out.println("用户名");
      name=scanner.nextLine();
      System.out.println("密码");
      pass=scanner.nextLine();
      if (name.equals(usreName)&&pass.equals(passWord)){
        System.out.println("成功登陆");
       break;
      }
    }
  }
}

