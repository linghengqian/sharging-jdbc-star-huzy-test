package org.example.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderVo implements Serializable {

    private Long id;

    private String orderNo;

    private Long memberId;

    private BigDecimal amount;

    private Long tenantId;
}
