package com.provider.dao;

import com.springcloud.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    Dept findById(Long id);

    List<Dept> findAll();

    boolean addDept(Dept dept);

}
