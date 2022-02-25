package com.siemens.test;

import com.siemens.impl.CalImpl;
import com.siemens.utils.Cal;

/**
 * <p>Create Time: 2022年02月25日 13:45          </p>
 **/
public class Test {
    public static void main(String[] args) {

        Cal cal = new CalImpl();
        cal.add(1,1);
        cal.sub(2,1);
        cal.mul(2,3);
        cal.div(6,2);
    }
}
