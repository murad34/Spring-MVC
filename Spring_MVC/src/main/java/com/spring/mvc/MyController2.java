package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController2 {

    @RequestMapping("")
    public String showFirstView() {
        return "second-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails2(Model model) {

        model.addAttribute("employee", new Employee());

        return "ask-emp-details2-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails2(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "ask-emp-details2-view";
        }

        return "show-emp-details2-view";
    }

}
