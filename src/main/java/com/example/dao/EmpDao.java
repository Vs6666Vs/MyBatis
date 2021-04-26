package com.example.dao;

import com.example.entity.Dept;
import com.example.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmpDao {
    List<Map<String,Object>> selectOne(@Param("dname") String dname,
                                       @Param("sal") String sal);
}
