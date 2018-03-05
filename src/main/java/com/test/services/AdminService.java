package com.test.services;

import com.test.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service(value = "adminService")
public class AdminService {


    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setJdbc(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    public Admin getAdmin() {

        int id = 0;
        MapSqlParameterSource params = new MapSqlParameterSource("id", id);
        return jdbc.queryForObject("select * from admin WHERE id = 0", params, new RowMapper<Admin>() {
            @Override
            public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
                Admin admin = null;
                admin = new Admin(resultSet.getString("username"), resultSet.getString("password"));
                return admin;
            }
        });
    }

    public boolean registerAdmin(Admin admin) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", 0);
        params.addValue("username", admin.getUsername());
        params.addValue("password", admin.getPassword());
        return jdbc.update("insert into admin (id, username, password) VALUES (0, :username, :password)", params) == 1;
    }
}
