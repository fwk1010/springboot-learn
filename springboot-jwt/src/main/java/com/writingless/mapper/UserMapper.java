package com.writingless.mapper;

import com.writingless.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * create by fangwk on 2017/11/26 21:59
 */
@Mapper
public interface UserMapper {
    User getUserByUid(Map<String,Integer> map);
}
