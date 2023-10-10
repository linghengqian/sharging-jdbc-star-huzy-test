package org.example.controller;


import org.example.pojo.dto.OrderDto;
import org.example.service.OrderService;
import org.example.utils.ResultModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author huzy
 * @Date 2023/9/11 14:21
 * @Description TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("/addOrder")
    public ResultModel addOrder(@RequestBody OrderDto orderDto){
        return  orderService.addOrder(orderDto);
    }

    @PostMapping("/deleteOrder")
    public ResultModel deleteOrder(@RequestBody OrderDto orderDto){
        return  orderService.deleteOrder(orderDto);
    }

    @PostMapping("/updateOrder")
    public ResultModel updateOrder(@RequestBody OrderDto orderDto){
        return  orderService.updateOrder(orderDto);
    }


    @PostMapping("/getOrderList")
    public ResultModel getOrderList(@RequestBody OrderDto orderDto){
        return  orderService.getOrderList(orderDto);
    }


    @PostMapping("/getOrderAmount")
    public ResultModel getOrderAmount(@RequestBody OrderDto orderDto){
        return  orderService.getOrderAmount(orderDto);
    }
}
