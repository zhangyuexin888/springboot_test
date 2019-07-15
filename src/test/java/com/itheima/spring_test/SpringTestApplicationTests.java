package com.itheima.spring_test;

import com.itheima.spring_test.dao.UserMapper;
import com.itheima.spring_test.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void findAll() {
		List<User> users = userMapper.selectList(null);
		System.out.println(users);
	}

	@Test
	public void save() {
        User user = new User();
        user.setId(6l);
        user.setName("哈哈");
        user.setAge(10);
        user.setEmail("888@qq.com");
        int insert = userMapper.insert(user);

        System.out.println(insert);
	}


}
