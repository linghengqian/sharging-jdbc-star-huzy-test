package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.pojo.bean.OrderItem;
import org.example.pojo.dto.OrderItemDto;
import org.example.utils.ResultModel;


/**
 * @Author huzy
 * @Date 2023/9/14 11:07
 * @Description TODO
 * @Version 1.0
 */
public interface OrderItemService extends IService<OrderItem> {
    ResultModel addOrderItem(OrderItemDto orderItemDto);

    ResultModel deleteOrderItem(OrderItemDto orderItemDto);

    ResultModel updateOrderItem(OrderItemDto orderItemDto);

    ResultModel getOrderItemList(OrderItemDto orderItemDto);
}
