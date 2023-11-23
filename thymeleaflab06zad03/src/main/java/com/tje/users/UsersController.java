package com.tje.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UsersController {

    @GetMapping("/")
    public String home(Model model) throws ParseException {
        String startDateString = "20/05/2007 07:32";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        long time = df.parse(startDateString).getTime();
        long daysTillRegistration = (new Date().getTime() - time) / (1000 * 60 * 60 * 24);
        Date startDate = df.parse(startDateString);
        User user = new User(2, "Artur", 29, User.UserType.ADMIN, startDate);
        model.addAttribute("user", user);
        model.addAttribute("daysTillRegistration", daysTillRegistration);
        return "home";
    }
}
