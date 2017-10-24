package com.sknn.chap0.knights;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA. Project: springinaction. Package: com.sknn.chap0.knights. User:
 * Administrator. Date: 2017-10-23 14:25. Author: Haiyangp.
 */
@RunWith(SpringJUnit4ClassRunner.class)//使用JUnit4来进行测试.
@ContextConfiguration(
    locations = {
        "classpath:knights.xml"})//Spring配置文件地址.
//@Transactional(timeout = 3)//开启事务
public class BaseSpringJunitTest {

}
