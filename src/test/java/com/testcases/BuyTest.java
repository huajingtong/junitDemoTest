package com.testcases;

import org.junit.Test;

public class BuyTest extends baseTest{
    @Test
    public void buy(){
        if (dataMap.get("login").equals("登录成功")){
            System.out.println("登陆成功");
        }
        else {
            System.out.println("登陆失败");
        }
    }
}
