package com.baidu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class TestController {

    @RequestMapping(value = "/test/sayHello.do", method = RequestMethod.GET)
    public String sayHello() {
        return "hello";
    }


    @ResponseBody
    @RequestMapping(value = "/test/sayOk.action", method = RequestMethod.GET)
    public Object sayOk() {
        ResultVo resultVo = new ResultVo();
        resultVo.setId(UUID.randomUUID().toString());
        resultVo.setName("resultVo");
        return resultVo;
    }


    class ResultVo {
        private String id;

        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
