package com.jk.controller;

import com.jk.service.OrderServiceFeign;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class OrderController {
    @Resource
    private OrderServiceFeign orderServiceFeign;


}
