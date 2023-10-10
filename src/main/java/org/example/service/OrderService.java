package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.pojo.bean.Order;
import org.example.pojo.dto.OrderDto;
import org.example.utils.ResultModel;


/**
 * @Author huzy
 * @Date 2023/9/11 14:08
 * @Description TODO
 * @Version 1.0
 */
public interface OrderService extends IService<Order> {
    ResultModel addOrder(OrderDto orderDto);

    ResultModel deleteOrder(OrderDto orderDto);

    ResultModel updateOrder(OrderDto orderDto);

    ResultModel getOrderList(OrderDto orderDto);

    ResultModel getOrderAmount(OrderDto orderDto);
}
