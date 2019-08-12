package com.dream.service.impl;

import com.dream.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author jzx
 * @email: jiazhaoxin@ule.com
 * @Date: 2019-05-06 15:48
 */
@Service
public class UserServiceImpl implements UserService{


    @Override
    public void getString(String data) {
        System.out.println("this is the second22222 project install");
        for (int i= 0; i < 100; i++) {
            System.out.println("s = " + data);
        }
    }
}
