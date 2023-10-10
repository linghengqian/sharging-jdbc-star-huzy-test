package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author huzy
 * @Date 2023/8/25 16:14
 * @Description TODO
 * @Version 1.0
 */

@SpringBootTest
public class ShardingTest {


    @Resource
    private OrderMapper orderMapper;

    @Resource
    private ProductMapper productMapper;

    /**
     * 水平分片：插入数据测试
     */
    @Test
    public void testInsertOrder(){
//        Order order = new Order();
//        order.setOrderNo("TEST-00001");
//        order.setUserId(1L);
//        order.setAmount(new BigDecimal(100));
//        order.setTenantId(3);
//        orderMapper.insert(order);
        Product product = new Product();
        product.setProductNo("TEST-00001");
        product.setTenantId(1);
        productMapper.insert(product);
    }
    /**
     * 水平分片：分库插入数据测试
     */
    @Test
    public void testInsertOrderDatabaseStrategy(){

//        for (long i = 0; i < 4; i++) {
//            Order order = new Order();
//            order.setOrderNo("TEST-00001"+i);
//            order.setUserId(i + 1);
//            order.setAmount(new BigDecimal(100));
//            orderMapper.insert(order);
//        }

        System.out.println("hash(i) = " + hash("Aa"));
        System.out.println("hash(i) = " + hash("BB"));
        Map map = new HashMap();
        map.put("Aa",1);
        map.put("BB",2);
        System.out.println(map.get("Aa"));
        System.out.println(map.get("BB"));

    }

    final int hash(Object key){
        int h;
        return (key==null) ? 0 : (h = key.hashCode()) ^ (h >> 16);
    }
}
