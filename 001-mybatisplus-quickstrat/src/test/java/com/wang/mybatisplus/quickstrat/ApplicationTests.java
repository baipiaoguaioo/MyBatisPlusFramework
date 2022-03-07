package com.wang.mybatisplus.quickstrat;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.mybatisplus.quickstrat.dao.UserMapper;
import com.wang.mybatisplus.quickstrat.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }

    @Test
    void contextLoads1() {
        Page<User> page = new Page<>(1,3);
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
    }

}
