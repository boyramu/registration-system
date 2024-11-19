package com.task.registration.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.task.registration.model.Registration;
import com.task.registration.service.RegistrationService;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/")
    public String showRegistrationForm(Model model) {
        List<Registration> list = registrationService.getAllRegistrations();
        model.addAttribute("registrations", list);
        return "index";
    }

    @PostMapping("/registrations")
    public String createRegistration(@RequestParam String name, 
                                      @RequestParam String email, 
                                      @RequestParam LocalDate dob) {
        Registration registration = new Registration(name, email, dob);
        registrationService.createRegistration(registration);
        return "redirect:/";
    }

    @RequestMapping("/{id}/edit")
    public ModelAndView showEditForm(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView();
        Registration registration = registrationService.getRegistrationById(id);
        mv.addObject("registration", registration);
        mv.setViewName("edit");
        return mv;
    }

    @PostMapping("/{id}/update")
    public String updateRegistration(@PathVariable Long id, 
                                     @RequestParam String name, 
                                     @RequestParam String email, 
                                     @RequestParam LocalDate dob) {
        Registration registration = new Registration(name, email, dob);
        registrationService.updateRegistration(id, registration);
        return "redirect:/";
    }

    @RequestMapping("/{id}/delete")
    public String deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
        return "redirect:/";
    }
}
