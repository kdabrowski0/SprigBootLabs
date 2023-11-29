package com.example.validForm.Controllers;

import com.example.validForm.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
@Slf4j
@Controller
public class UserController {
    @GetMapping("/createUser")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/createUser")
    public String registerUser(@Valid User user, Errors errors, Model model) {
        if(errors.hasErrors()) {
            return "form";
        }
        log.info("User created: " + user);

        List<User> registeredUsers = new ArrayList<>();
        registeredUsers.add(user);

        model.addAttribute("registeredUsers", registeredUsers);

        return "form";
    }

}
