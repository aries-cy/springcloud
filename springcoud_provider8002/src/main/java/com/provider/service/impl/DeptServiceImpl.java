package com.provider.service.impl;

import com.provider.dao.DeptDao;
import com.provider.service.DeptService;
import com.springcloud.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;


    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }
}
