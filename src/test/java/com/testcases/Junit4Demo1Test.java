package com.testcases;

import org.junit.*;

public class Junit4Demo1Test {

    @BeforeClass
    public static void beforeclass(){
        System.out.println("beforeclass");
    }

    @Before
    public  void before(){
        System.out.println("before");
    }

    @Test
    public void func1(){
        System.out.println("func1");
    }

    @Test
    public void func2(){
        System.out.println("func2");
    }

    @After
    public  void after(){
        System.out.println("after");
    }

    @AfterClass
    public static void afterclass(){
        System.out.println("afterclass");
    }
}
