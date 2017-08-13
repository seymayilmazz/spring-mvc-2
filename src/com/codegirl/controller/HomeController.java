package com.codegirl.controller;

import com.codegirl.model.Employee;
import com.codegirl.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Şeyma Yılmaz on 13.8.2017.
 */
@Controller
public class HomeController {

    @RequestMapping ("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/welcome")
    public ModelAndView showWelcomePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        modelAndView.addObject("name", "Şeyma Yılmaz");
        modelAndView.addObject("age", 23);

        return modelAndView;
    }

    @RequestMapping("/personInfo")
    public ModelAndView showPersonInfo(){
        ModelAndView modelAndView = new ModelAndView("personInfo");

        Person personInfo = new Person();
        personInfo.setName("Şeyma Yılmaz");
        personInfo.setAge(23);

        modelAndView.addObject("personInfo", personInfo);

        return modelAndView;
    }

    @RequestMapping("/employeeInfo")
    public ModelAndView showEmployeePage(){
        ModelAndView modelAndView=new ModelAndView("employeeInfo");

        Employee employeeInfo=new Employee();
        employeeInfo.setName("seyma yılmaz");
        employeeInfo.setMaas(3500);
        employeeInfo.setDepartmant("Mühendis");

        modelAndView.addObject("employeeInfo", employeeInfo);
        return modelAndView;
    }

    @RequestMapping("/employee")
    public String showEmplyeeInfo(Model model){

        Employee employeeInfo=new Employee();
        employeeInfo.setName("seyma yılmaz");
        employeeInfo.setMaas(3500);
        employeeInfo.setDepartmant("Mühendis");
        model.addAttribute("employeeInfo", employeeInfo);

        return "employeeInfo";
    }

}
