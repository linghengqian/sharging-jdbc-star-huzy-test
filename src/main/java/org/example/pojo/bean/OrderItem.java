package org.example.pojo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@TableName("t_order_item")
@Data
public class OrderItem {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String orderNo;

    private Long memberId;

    private BigDecimal price;

    private Integer count;

    private Long tenantId;
}