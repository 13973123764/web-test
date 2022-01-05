package cn.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zfan
 * @date: 2021/12/31
 */
@Controller
@RequestMapping("/test")
public class MyWebController {


    @ResponseBody
    @GetMapping("/index")
    public String index(HttpServletRequest request) {
        return request.getLocalAddr() + "/index";
    }

}
