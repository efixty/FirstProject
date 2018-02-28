package com.test.aop;

import com.test.Admin;
import com.test.services.AdminService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.validation.BindingResult;

import java.text.Bidi;

public class AnAspect {


    @Pointcut("args(adminFromJSP, result)")
    public void args(Admin adminFromJSP, BindingResult result) {
    }

    @Pointcut("target(com.test.controllers.AdminController)")
    public void target(){
    }

    @Before("args(adminFromJSP) && target()")
    public void manageAdmin(JoinPoint jp, Admin adminFromJSP, BindingResult result) {
        AdminService adminService = new AdminService();
        try {
            Admin adminFromDB;
            adminFromDB = adminService.getAdmin();
        } catch (EmptyResultDataAccessException e) {
            adminService.registerAdmin(adminFromJSP);
        }
    }


}
