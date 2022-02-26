package com.siemens.aop;

import com.siemens.utils.Cal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Create Time: 2022年02月25日 16:26          </p>
 **/
public class TestAop {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Cal proxy = (Cal) applicationContext.getBean("calImpl");
        proxy.add(2,3);
    }
}
