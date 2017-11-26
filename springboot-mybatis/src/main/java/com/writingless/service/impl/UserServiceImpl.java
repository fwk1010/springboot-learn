package com.writingless.service.impl;

import com.writingless.bean.User;
import com.writingless.mapper.UserMapper;
import com.writingless.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * create by fangwk on 2017/11/26 22:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        if (id == null){
            return  null;
        }
        Map<String,Integer> map = new HashMap<>(16);
        map.put("id",id);
        return userMapper.getUserByUid(map);
    }
}

