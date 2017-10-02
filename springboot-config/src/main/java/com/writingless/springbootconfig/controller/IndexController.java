package com.writingless.springbootconfig.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * create by fangwk on 2017/10/2 22:51
 */
@Controller
public class IndexController {
    @RequestMapping(value = "index")
    @ResponseBody
    public JSONObject index() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a","a");
        jsonObject.put("b","b");
        jsonObject.put("hot restart is ok?","true");
        return jsonObject;
    }
}
