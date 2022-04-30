/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abmlspring.practica.security.util;

import com.abmlspring.practica.security.entity.Rol;
import com.abmlspring.practica.security.enums.RolName;
import com.abmlspring.practica.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Usuario Leo
 */
@Component
public class CreateRoles implements CommandLineRunner {
    
//    lo ejecutamos solo una vez para crear los roles. ...
    @Autowired
    RolService rolService;
    
    @Override
    public void run(String... args) throws Exception {
//        Rol rolAdmin = new Rol(RolName.ROLE_ADMIN);
//        Rol rolUser = new Rol(RolName.ROLE_USER);
//        rolService.save(rolAdmin);
//        rolService.save(rolUser);
       
    }
    
}
