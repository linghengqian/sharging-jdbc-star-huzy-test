package org.example.controller;


import org.example.pojo.dto.OrderItemDto;
import org.example.service.OrderItemService;
import org.example.utils.ResultModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author huzy
 * @Date 2023/9/14 11:27
 * @Description TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
    @Resource
    private OrderItemService orderItemService;

    @PostMapping("/addOrderItem")
    public ResultModel addOrderItem(@RequestBody OrderItemDto orderItemDto){
        return  orderItemService.addOrderItem(orderItemDto);
    }

    @PostMapping("/deleteOrderItem")
    public ResultModel deleteOrderItem(@RequestBody OrderItemDto orderItemDto){
        return  orderItemService.deleteOrderItem(orderItemDto);
    }

    @PostMapping("/updateOrderItem")
    public ResultModel updateOrderItem(@RequestBody OrderItemDto orderItemDto){
        return  orderItemService.updateOrderItem(orderItemDto);
    }


    @PostMapping("/getOrderItemList")
    public ResultModel getOrderItemList(@RequestBody OrderItemDto orderItemDto){
        return  orderItemService.getOrderItemList(orderItemDto);
    }
}
