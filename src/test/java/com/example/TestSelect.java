package com.example;

import com.example.dao.EmpDao;
import com.example.entity.Dept;
import com.example.entity.Emp;
import com.example.untils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestSelect {
    @Test
    public void TestOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        EmpDao dao = sqlSession.getMapper(EmpDao.class);
        List<Map<String,Object>> mapList = dao.selectOne("ACCOUNTING","400");
        for (Map<String,Object> maps : mapList){
            System.out.println(maps);
        }
    }

    @Test
    public void TestTwo(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        EmpDao dao = sqlSession.getMapper(EmpDao.class);
        List<Map<String,Object>> mapList = dao.selectOne("ACCOUNTING","400");
        for (Map<String,Object> maps : mapList){
            System.out.println(maps);
        }
    }

    @Test
    public void TestThree(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        EmpDao dao = sqlSession.getMapper(EmpDao.class);
        List<Map<String,Object>> mapList = dao.selectOne("ACCOUNTING","400");
        for (Map<String,Object> maps : mapList){
            System.out.println(maps);
        }
    }
}
