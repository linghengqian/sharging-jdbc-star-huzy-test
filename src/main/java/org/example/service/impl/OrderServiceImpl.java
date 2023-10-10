package org.example.service.impl;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.OrderMapper;
import org.example.pojo.bean.Order;
import org.example.pojo.dto.OrderDto;
import org.example.pojo.vo.OrderDetailVo;
import org.example.pojo.vo.OrderVo;
import org.example.service.OrderService;
import org.example.utils.ResultModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author huzy
 * @Date 2023/9/11 14:12
 * @Description TODO
 * @Version 1.0
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public ResultModel addOrder(OrderDto orderDto) {
        Order order = new Order();
        BeanUtil.copyProperties(orderDto, order, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        orderMapper.insert(order);
        return ResultModel.success();
    }

    @Override
    public ResultModel deleteOrder(OrderDto orderDto) {
        LambdaQueryWrapper<Order> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Order::getTenantId,orderDto.getTenantId());
        wrapper.eq(Order::getId,orderDto.getId());
        orderMapper.delete(wrapper);
        return ResultModel.success();
    }

    @Override
    public ResultModel updateOrder(OrderDto orderDto) {
        Order order = new Order();
        BeanUtil.copyProperties(orderDto, order, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        LambdaQueryWrapper<Order> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Order::getTenantId,orderDto.getTenantId());
        wrapper.eq(Order::getId,orderDto.getId());
        orderMapper.update(order,wrapper);
        return ResultModel.success();
    }

    @Override
    public ResultModel getOrderList(OrderDto orderDto) {
        List<OrderVo> list = orderMapper.getOrderList(orderDto);
        return ResultModel.success(list);
    }

    @Override
    public ResultModel getOrderAmount(OrderDto orderDto) {
        List<OrderDetailVo> list = orderMapper.getOrderAmount(orderDto);
        return ResultModel.success(list);
    }
}
