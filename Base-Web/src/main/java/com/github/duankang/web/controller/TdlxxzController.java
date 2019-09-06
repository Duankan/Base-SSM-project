package com.github.duankang.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/tdlyxz")
public class TdlxxzController {

    @RequestMapping(value = "/overlayer", method = RequestMethod.POST)
    @ResponseBody
    public Map staticsOverLayer(@RequestBody String param) {
        Map mp = new HashMap();
        mp.put("code", 200);
        mp.put("data", "222");
        mp.put("msg", "");
        return mp;
    }
}
