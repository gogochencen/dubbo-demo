package org.example;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ConsumerApplicationTest {

    @DubboReference(url="dubbo://192.168.3.10:20880/org.example.UserService")
    private UserService userService;

    @Test
    public void test(){
        boolean success = userService.login("chencen","test");
        Assertions.assertTrue(success);
    }

}