package com.example.untils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory factory = null;

    static{
        // 定义mybatis主配置文件的名称，从类路径的根开始(target/classes)
        String config = "mybatis.xml";
        // 读取这个文件的内容
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(in);
    }

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        if(factory != null) {
            sqlSession = factory.openSession();
        }
        return sqlSession;
    }
}
