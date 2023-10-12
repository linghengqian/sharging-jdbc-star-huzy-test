package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.pojo.bean.OrderItem;
import org.example.pojo.vo.OrderItemVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderItemMapper extends BaseMapper<OrderItem> {
    List<OrderItemVo> getOrderList();
}
