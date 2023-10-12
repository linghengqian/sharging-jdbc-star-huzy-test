package org.example.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemVo implements Serializable{
    private Long id;

    private String orderNo;

    private Long memberId;

    private BigDecimal price;

    private Integer count;

    private Long tenantId;
}