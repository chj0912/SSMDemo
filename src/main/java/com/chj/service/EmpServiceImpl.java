package com.chj.service;

import com.chj.dao.EmpDao;
import com.chj.entity.Emp;

import java.util.List;

public class EmpServiceImpl implements EmpService {

    private EmpDao empDao;
    @Override
    public void setEmpDao(EmpDao empDao) {
        this.empDao=empDao;
    }

    @Override
    public void save(Emp emp) {
        empDao.save(emp);
    }

    @Override
    public void delete(Integer id) {
        empDao.delete(id);
    }

    @Override
    public void update(Emp emp) {
         empDao.update(emp);
    }

    @Override
    public Emp findById(Integer id) {
        return empDao.findById(id);
    }

    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }
}
