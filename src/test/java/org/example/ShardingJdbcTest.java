package org.example;

import org.example.mapper.OrderItemMapper;
import org.example.mapper.OrderMapper;
import org.example.pojo.bean.Order;
import org.example.pojo.bean.OrderItem;
import org.example.pojo.vo.OrderDetailVo;
import org.example.pojo.vo.OrderItemVo;
import org.example.pojo.vo.OrderVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ShardingJdbcTest {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    OrderItemMapper orderItemMapper;

    @Test
    void testIssues28704() {
        // 1st operation
        Order order = new Order();
        order.setOrderNo("XXXX-001");
        order.setMemberId(1L);
        order.setAmount(new BigDecimal(1000));
        order.setTenantId(1L);
        orderMapper.insert(order);
        // 2nd operation
        List<OrderVo> list = orderMapper.getOrderList();
        assertThat(list).isNotEmpty();
        // 3rd operation
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderNo("XXXX-001");
        orderItem.setMemberId(1L);
        orderItem.setPrice(new BigDecimal(10));
        orderItem.setCount(5);
        order.setTenantId(1L);
        orderItemMapper.insert(orderItem);
        // 4th operation
        List<OrderItemVo> listSecond = orderItemMapper.getOrderList();
        assertThat(listSecond).isNotEmpty();
        // 5th operation
        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> {
            List<OrderDetailVo> listThird = orderMapper.getOrderAmount();
            assertThat(listThird).isNotEmpty();
        });
    }
}
