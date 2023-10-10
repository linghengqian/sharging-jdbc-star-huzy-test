package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.pojo.bean.OrderItem;
import org.example.pojo.dto.OrderItemDto;
import org.example.pojo.vo.OrderItemVo;


import java.util.List;

/**
 * @Author huzy
 * @Date 2023/9/11 14:48
 * @Description TODO
 * @Version 1.0
 */
public interface OrderItemMapper extends BaseMapper<OrderItem> {

    List<OrderItemVo> getOrderList(OrderItemDto orderItemDto);
}
