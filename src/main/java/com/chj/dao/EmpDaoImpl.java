package com.chj.dao;

import com.chj.entity.Emp;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmpDaoImpl implements EmpDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;

    }

    @Override
    public void save(Emp emp) {
       jdbcTemplate.update("intset into emp values (null ,?,?,?)",
               emp.getName(),emp.getSalary(),emp.getAge());

    }

    @Override
    public void delete(Integer id) {
      jdbcTemplate.update("delete from emp where id=?",id);
    }

    @Override
    public void update(Emp emp) {
        jdbcTemplate.update("update emp set name=?,salary=?,age=? where id=? ",
                emp.getName(),emp.getSalary(),emp.getAge(),emp.getId());
    }

    @Override
    public Emp findById(Integer id) {
        Emp emp=jdbcTemplate.queryForObject("select * from emp where id=?",new BeanPropertyRowMapper<>(Emp.class),id);
        return emp;
    }

    @Override
    public List<Emp> findAll() {

        List<Emp> list=jdbcTemplate.query("select * from emp",new BeanPropertyRowMapper<>(Emp.class));
        return list;
    }
}
