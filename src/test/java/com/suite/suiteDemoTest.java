package com.suite;

import com.testcases.BuyTest;
import com.testcases.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        /**
         * 配置的顺序会影响执行
         */
        LoginTest.class,
        BuyTest.class
})
public class suiteDemoTest {

}
