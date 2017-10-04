package controller;

import annotation.RequestLimit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/account")
public class AOPInterceptController {
    /**
     * 加入注解@RequestLimit 被拦截
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @RequestLimit
    public String login(@RequestParam(value = "username") String username, HttpServletRequest request) {
        request.setAttribute("username", username);
        return "jsp/loginSuccess";
    }
}
