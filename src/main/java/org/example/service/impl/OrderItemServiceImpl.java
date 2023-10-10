package org.example.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.OrderItemMapper;
import org.example.pojo.bean.OrderItem;
import org.example.pojo.dto.OrderItemDto;
import org.example.pojo.vo.OrderItemVo;
import org.example.service.OrderItemService;
import org.example.utils.ResultModel;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * @Author huzy
 * @Date 2023/9/14 11:07
 * @Description TODO
 * @Version 1.0
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {
    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public ResultModel addOrderItem(OrderItemDto orderItemDto) {
        OrderItem orderItem = new OrderItem();
        BeanUtil.copyProperties(orderItemDto, orderItem, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        orderItemMapper.insert(orderItem);
        return ResultModel.success();
    }

    @Override
    public ResultModel deleteOrderItem(OrderItemDto orderItemDto) {
        LambdaQueryWrapper<OrderItem> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(OrderItem::getTenantId,orderItemDto.getTenantId());
        wrapper.eq(OrderItem::getId,orderItemDto.getId());
        orderItemMapper.delete(wrapper);
        return ResultModel.success();
    }

    @Override
    public ResultModel updateOrderItem(OrderItemDto orderItemDto) {
        OrderItem orderItem = new OrderItem();
        BeanUtil.copyProperties(orderItemDto, orderItem, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        LambdaQueryWrapper<OrderItem> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(OrderItem::getTenantId,orderItemDto.getTenantId());
        wrapper.eq(OrderItem::getId,orderItemDto.getId());
        orderItemMapper.update(orderItem,wrapper);
        return ResultModel.success();
    }

    @Override
    public ResultModel getOrderItemList(OrderItemDto orderItemDto) {
        List<OrderItemVo> list = orderItemMapper.getOrderList(orderItemDto);
        return ResultModel.success(list);
    }
}
