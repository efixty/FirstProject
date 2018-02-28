package com.test.controllers;

import com.test.Admin;
import com.test.exceptions.YouDontHaveAccessException;
import com.test.services.AdminService;
import com.test.validation.ValidAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@Controller
public class AdminController {

    private AdminService adminService;

    @Autowired
    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("/admin")
    public String goAdmin() {
        return "admin";
    }


    @RequestMapping(value = "/adminsPage", method = RequestMethod.POST)
    public ModelAndView goAdminsPage(@ValidAdmin Admin adminFromJSP, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView("adminsPage");
        if(result.hasErrors()) {
            modelAndView.setViewName("admin");
        }
        return modelAndView;
    }

    private boolean checkAdmin(Admin admin1, Admin admin2) {
        return admin1.equals(admin2);
    }

}
