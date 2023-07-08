/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vttanh.Controllers;



import javax.ejb.TransactionManagement;
import javax.persistence.Query;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */

@Controller
public class indexController {
    @Autowired
    private LocalSessionFactoryBean fatory;
    
    
    @RequestMapping("/")
    public String index(Model model) {
        Session s = this.fatory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Product");
        
        model.addAttribute("products", q.getResultList());
        return "index";
    }
}
