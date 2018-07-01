/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Marija
 */
@Controller
public class MeniController {
    @Autowired
    private GenericDAO genericDAO;
    
    @RequestMapping("/")
    public String meni(Model model) {
        System.out.println("Usao u metodu meni");
        model.addAttribute("darko", "DARKOOOOOO");
        return "meni";
    }
}
