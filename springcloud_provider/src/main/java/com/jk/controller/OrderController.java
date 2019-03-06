package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OrderController {

    //表明该方法只有get请求
  //  @RequestMapping(value = "queryOrder",method = RequestMethod.GET)

    @GetMapping("queryOrder")
    @ResponseBody
    public Map<String,Object> queryOrder(){
        Map<String, Object> order = new HashMap<>();
        order.put("orderId","jf9w3057");
        order.put("orderDesc","iphone XS MAX");
        order.put("orderPrice","99");
        return order;
    }
}
