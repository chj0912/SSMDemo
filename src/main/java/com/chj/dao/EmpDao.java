package com.chj.dao;

import com.chj.entity.Emp;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface EmpDao {

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate);
    public void save(Emp emp);
    public void delete(Integer id);
    public void update(Emp emp);
    public Emp findById(Integer id);
    public List<Emp> findAll();

}
