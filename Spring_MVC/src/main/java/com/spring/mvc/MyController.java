package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/1")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

//    @RequestMapping("showDetails")
//    public String showEmployeeDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest httpServletRequest, Model model) {
//
//        String empName = httpServletRequest.getParameter("employeeName");
//        empName = "Mr. " + empName;
//
//        model.addAttribute("nameAttribute",empName);
//
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {

        empName = "Mr. " + empName + " ! ! !";

        model.addAttribute("nameAttribute", empName);

        return "show-emp-details-view";
    }

}
