package com.test.controllers;

import com.test.Admin;
import com.test.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView goAdminsPage(Admin adminFromJSP) {

        ModelAndView modelAndView = new ModelAndView("admin");

        try {
            Admin adminFromDB = adminService.getAdmin();
            if(adminFromDB.equals(adminFromJSP)) {
                modelAndView.setViewName("adminsPage");
                modelAndView.addObject("adminUsername", adminFromDB.getUsername());
            }
        } catch (EmptyResultDataAccessException e) {
            adminService.registerAdmin(adminFromJSP);
            System.out.printf("New admin was registered (because none was found in db) with username: %s and password: %s", adminFromJSP.getUsername(), adminFromJSP.getPassword());
            modelAndView.addObject("adminUsername", adminFromJSP.getUsername());
            modelAndView.setViewName("adminsPage");
        }
        return modelAndView;
    }
}
