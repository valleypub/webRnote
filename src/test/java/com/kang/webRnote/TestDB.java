package com.kang.webRnote;


import com.kang.webRnote.util.DBUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单元测试类
 */
public class TestDB {

    // 使用日志工厂类，记入日志
    private static Logger logger = LoggerFactory.getLogger(DBUtil.class);


    @Test
    public void testConnection() {
        System.out.println(DBUtil.getConnection());
        //使用日志
        logger.info("获取数据库连接："+DBUtil.getConnection());
    }
}

