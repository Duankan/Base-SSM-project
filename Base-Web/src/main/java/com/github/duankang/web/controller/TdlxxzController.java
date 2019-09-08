package com.github.duankang.web.controller;

import com.github.duankang.domain.bussiesenum.BussiesEnum;
import com.github.duankang.domain.response.Response;
import com.github.duankang.service.entities.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tdlyxz")
public class TdlxxzController {

    @RequestMapping(value = "/overlayer", method = RequestMethod.POST)
    @ResponseBody
    public Response<Task> staticsOverLayer(@RequestBody String param) {
        return new Response<Task>(BussiesEnum.SUCCESS, null);
    }
}
