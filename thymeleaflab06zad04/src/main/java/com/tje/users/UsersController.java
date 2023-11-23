package com.tje.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

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
    @GetMapping("/list")
    public String list(Model model) throws ParseException {
        List<User> userList = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        userList.add(new User(1, "Jan", 25, User.UserType.REGISTERED, df.parse("20/05/2017 07:32")));
        userList.add(new User(2, "Anna", 30, User.UserType.REGISTERED, df.parse("15/10/2019 12:45")));
        userList.add(new User(3, "Kamil", 22, User.UserType.REGISTERED, df.parse("02/03/2021 18:20")));
        userList.add(new User(4, "Ewa", 35, User.UserType.REGISTERED, df.parse("10/07/2015 09:10")));
        userList.add(new User(5, "Marek", 28, User.UserType.REGISTERED, df.parse("01/12/2022 14:30")));
        userList.add(new User(6, "Karolina", 31, User.UserType.REGISTERED, df.parse("05/06/2018 21:15")));
        userList.add(new User(7, "Piotr", 27, User.UserType.REGISTERED, df.parse("18/09/2016 08:55")));

        model.addAttribute("users", userList);
        return "list";
    }

}
