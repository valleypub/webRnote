package com.kang.webRnote;


import com.kang.webRnote.dao.BaseDao;
import com.kang.webRnote.dao.UserDao;
import com.kang.webRnote.po.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TestUser {
    @Test
    public void testQueryUserByName() {
        UserDao userDao = new UserDao();
        User user = userDao.queryUserByName("admin");
        System.out.println(user.getUpwd()); // 输出的是加密的密码
    }

    @Test
    public void tsetAdd() {
        String sql = "insert into tb_user (uname, upwd, nick, head, mood) values (?, ?, ?, ?, ?)";
        List<Object> params = new ArrayList<>();
        params.add("kanghaiquan");
        params.add("e10adc3949ba59abbe56e057f20f883e");
        params.add("zixian");
        params.add("coding.jpg");//这些图片是在WEB-INF/upload/下的
        params.add("Hello Code");
        int row = BaseDao.executeUpdate(sql, params);
        System.out.println(row);
    }
}

