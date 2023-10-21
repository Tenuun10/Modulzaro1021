package com.example.modulzaro1021.controller;

import com.example.modulzaro1021.model.People;
import com.example.modulzaro1021.service.OrderDetailsService;
import com.example.modulzaro1021.service.PeopleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class PeopleHomeController {
    private final PeopleService peopleService;
    private final OrderDetailsService orderDetailsService;


    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("showPeople",peopleService.showPeople());
        model.addAttribute("showOrders",orderDetailsService.showPeople());
        return "home";
    }
    @GetMapping("/orders")
    public String getOrders(){
        return "orders";
    }
    @GetMapping("/people")
    public String getPeople(){
        return "people";
    }

    @GetMapping("/new")
    public String addNewPerson(Model model){
        model.addAttribute("add",new People());
        return "people";
    }

    @PostMapping("/add")
    public String addNewPerson(@ModelAttribute("add") People people){
        peopleService.savePerson(people);
        return "redirect:/home";
    }

    @GetMapping("update/{id}")
    public String updatePerson(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("updatePerson", peopleService.getPersonById(id));
    return "people_update";
    }

    @PostMapping("update/{id}")
    public String updatePerson(@PathVariable("id")Integer id,@ModelAttribute("updatePerson") People updated){
        peopleService.saveUpdatedPerson(updated);
        return "redirect:/home/"+id;
    }




}
