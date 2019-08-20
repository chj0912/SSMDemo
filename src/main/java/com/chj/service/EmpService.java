package com.chj.service;

import com.chj.dao.EmpDao;
import com.chj.entity.Emp;

import java.util.List;

public interface EmpService {

    public void setEmpDao(EmpDao empDao);
    public void save(Emp emp);
    public void delete(Integer id);
    public void update(Emp emp);
    public Emp findById(Integer id);
    public List<Emp> findAll();


}
