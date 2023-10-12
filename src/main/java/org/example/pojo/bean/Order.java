package org.example.pojo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

//逻辑表名
@TableName("t_order")
@Data
public class Order implements Serializable {
    //分布式id（默认值）
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String orderNo;

    private Long memberId;

    private BigDecimal amount;

    private Long tenantId;
}
