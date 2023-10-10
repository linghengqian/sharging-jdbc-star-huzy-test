package org.example.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.bean.Order;
import org.example.pojo.dto.OrderDto;
import org.example.pojo.vo.OrderDetailVo;
import org.example.pojo.vo.OrderVo;

import java.util.List;


@Mapper
public interface OrderMapper extends BaseMapper<Order> {


    List<OrderVo> getOrderList(OrderDto orderDto);

    int getOrderListCount(OrderDto orderDto);

    List<OrderDetailVo> getOrderAmount(OrderDto orderDto);

    int getOrderAmountCount(OrderDto orderDto);
}
