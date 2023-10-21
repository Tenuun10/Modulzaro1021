package com.example.modulzaro1021.controller;

import com.example.modulzaro1021.model.OrderDetails;
import com.example.modulzaro1021.service.OrderDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class OrdersController {
    private final OrderDetailsService orderDetailsService;



    @GetMapping("/newOrder")
    public String newOrder(Model model){
        model.addAttribute("newOrder",new OrderDetails());
        return "orders";
    }

    @PostMapping("/newOrder")
    public String newOrder(@ModelAttribute("newOrder") OrderDetails order){
        orderDetailsService.saveOrder(order);
        return "redirect:/home";
    }
    }
