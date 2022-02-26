package com.siemens.impl;

import com.siemens.utils.Cal;
import org.springframework.stereotype.Component;

/**
 * <p>Create Time: 2022年02月25日 13:37          </p>
 **/

@Component
public class CalImpl implements Cal {


    public int add(int num1, int num2) {
      //  System.out.println("add method parameters:" + num1+","+num2);
        int result = num1 + num2;
  //      System.out.println("result was:" + result);
        return result;
    }

    public int sub(int num1, int num2) {
      //  System.out.println("sub method parameters:" + num1+","+num2);
        int result = num1 - num2;
     //   System.out.println("result was:" + result);
        return result;
    }

    public int mul(int num1, int num2) {
     //   System.out.println("mul method parameters:" + num1+","+num2);
        int result = num1 * num2;
      //  System.out.println("result was:" + result);
        return result;
    }

    public int div(int num1, int num2) {
      //  System.out.println("div method parameters:" + num1+","+num2);
        int result = num1 /  num2;
       // System.out.println("result was:" + result);
        return result;
    }
}

