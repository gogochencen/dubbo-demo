package org.example;


import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String name, String pwd) {
        log.info("login name: {}, pwd: {}", name, pwd);
        return false;
    }
}
