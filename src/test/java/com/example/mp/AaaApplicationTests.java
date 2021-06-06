package com.example.mp;

import com.example.mp.entity.User;
import com.example.mp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AaaApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(u-> System.out.println(u.getName()));

    }

    @Test
    void insertUser() {
        User user=new User();
        user.setName("xxl1");
        userMapper.insert(user);
    }

    @Test
    void updateUser() {
        User user = userMapper.selectById(1401400398591287298L);
        user.setName("xxl322");
        userMapper.updateById(user);
    }

    @Test
    void deleteUser() {
       userMapper.deleteById(1401400398591287298L);
    }

}
