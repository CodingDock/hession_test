package com.xmm.hessian.service;

import com.xmm.bean.User;
import org.springframework.stereotype.Service;

/**
 * Created by 肖明明 on 2017/1/20.
 */
@Service
public class UserServiceImpl implements UserService{


    @Override
    public User getUser() {
        return new User(12,"李四");
    }
    
    
    
    
}
