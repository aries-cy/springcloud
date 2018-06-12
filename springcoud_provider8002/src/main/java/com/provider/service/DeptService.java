package com.provider.service;

import com.springcloud.bean.Dept;

import java.util.List;

public interface DeptService {

    Dept get(Long id);

    List<Dept> list();

    boolean add(Dept dept);

}
