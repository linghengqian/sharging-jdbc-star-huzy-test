package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.pojo.bean.Order;
import org.example.pojo.vo.OrderDetailVo;
import org.example.pojo.vo.OrderVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderMapper extends BaseMapper<Order> {
    List<OrderVo> getOrderList();

    List<OrderDetailVo> getOrderAmount();
}
