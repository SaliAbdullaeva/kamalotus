package com.example.kamalotus.controller;

import com.example.kamalotus.dto.BookingRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @PostMapping("/submit")
    public String handleForm(@Valid @ModelAttribute BookingRequest request, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "form"; // вернуть форму с ошибками
        }
        model.addAttribute("request", request);
        return "result";
    }

}
