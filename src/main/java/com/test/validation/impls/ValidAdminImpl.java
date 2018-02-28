package com.test.validation.impls;

import com.test.Admin;
import com.test.services.AdminService;
import com.test.validation.ValidAdmin;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidAdminImpl implements ConstraintValidator<ValidAdmin, Admin>{

    private String message;

    @Override
    public void initialize(ValidAdmin validAdmin) {
        message = validAdmin.message();
    }

    @Override
    public boolean isValid(Admin adminFromJSP, ConstraintValidatorContext constraintValidatorContext) {
        AdminService adminService = new AdminService();
        Admin adminFromDB;
        adminFromDB = adminService.getAdmin();
        return adminFromJSP.equals(adminFromDB);
    }
}
