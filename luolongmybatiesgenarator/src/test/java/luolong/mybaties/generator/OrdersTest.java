package luolong.mybaties.generator;


import lombok.extern.slf4j.Slf4j;
import luolong.mybaties.generator.mapper.OrdersMapper;
import luolong.mybaties.generator.pojo.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p></p>
 *
 * @author luolong
 * @date 2018/6/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrdersTest {

    @Autowired
    OrdersMapper ordersMapper;

    @Test
    public void selectOrderTest(){
        Orders orders = ordersMapper.selectById("D20180130000028");
        assert orders != null : "查询订单D20180130000028不存在";
    }
}
