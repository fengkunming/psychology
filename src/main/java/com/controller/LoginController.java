package com.controller;

import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
* @Description:
* @Author:         jhao
* @CreateDate:     2019/4/21 11:15
* @UpdateUser:     jhao
* @UpdateDate:     2019/4/21 11:15
* @UpdateRemark:
* @Version:        1.0
*/
@Controller("/new")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String list(Model model) {
        /**
         * 方法实现说明
         * @author      jhao
         * @param       [model]
         * @return      java.lang.String
         * @exception
         * @date        2019/4/21 11:17
         */


        return "login";
    }
}
