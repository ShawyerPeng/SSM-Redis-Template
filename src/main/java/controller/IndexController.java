package controller;

import annotation.RequestLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/redis")
public class IndexController {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @RequestLimit(count = 4)
    @ResponseBody
    @RequestMapping("/index")
    public Object index() {
        return "ok";
    }
}
