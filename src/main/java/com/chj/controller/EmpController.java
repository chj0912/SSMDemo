package com.chj.controller;

import com.chj.entity.Emp;
import com.chj.service.EmpService;

import java.util.List;

public class EmpController {

    private EmpService empService;

    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }

    public void save(Emp emp) {
        empService.save(emp);
    }

    public void delete(Integer id) {
        empService.delete(id);
    }

    public void update(Emp emp) {
        empService.update(emp);
    }

    public Emp findById(Integer id) {
        return empService.findById(id);
    }

    public List<Emp> findAll() {
        return empService.findAll();
    }

}
