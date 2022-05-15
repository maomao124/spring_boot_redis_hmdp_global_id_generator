package mao.spring_boot_redis_hmdp.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_redis_hmdp_global_id_generator
 * Package(包名): mao.spring_boot_redis_hmdp.utils
 * Class(测试类名): RedisIDGeneratorTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/15
 * Time(创建时间)： 12:37
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class RedisIDGeneratorTest
{

    @Autowired
    private RedisIDGenerator redisIDGenerator;

    @Test
    void nextID()
    {
        for (int i = 0; i < 10000; i++)
        {
            redisIDGenerator.nextID("shop");
        }
        Long id = redisIDGenerator.nextID("shop");
        System.out.println(id);
    }
}