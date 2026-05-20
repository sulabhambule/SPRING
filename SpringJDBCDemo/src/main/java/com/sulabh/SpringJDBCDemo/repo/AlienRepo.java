package com.sulabh.SpringJDBCDemo.repo;

import com.sulabh.SpringJDBCDemo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {

    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien){
        String sql = "insert into alien (id, name, tech) values (?, ?, ?)";
        // so update parameter takes sql query and the parameters.
        int rows = template.update(sql, alien.getId(), alien.getName(), alien.getTech());
        System.out.println(rows);
    }

    public List<Alien> findAll() {
        String sql = "select * from alien";

//        RowMapper<Alien> mapper = new RowMapper<Alien>() {
//            @Override
//            public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                Alien a = new Alien();
//                a.setId(rs.getInt(1));
//                a.setName(rs.getString(2));
//                a.setTech(rs.getString(3));
//
//                return a;
//            } // the mapper function run multiple times , the number of rows in the resultset and add each aliens into the ArrayList.
//        };

        List<Alien> aliens = template.query(sql, (rs, rowNum) -> {
            Alien a = new Alien();
            a.setId(rs.getInt(1));                                              
            a.setName(rs.getString(2));
            a.setTech(rs.getString(3));
            return a;
        });
        return aliens;
    }
}
