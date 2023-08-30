package com.projecttask.projecttask.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projecttask.projecttask.Model.UserSignup;
import com.projecttask.projecttask.Repository.UserSignup_Repo;



@Controller
public class SignupController {

    @Autowired
    private UserSignup_Repo userRepo;
    
    @GetMapping("/signup")
    public String signup(){

        return "signup";
    }

    @PostMapping("/signup")
    public String signupDetails(UserSignup user){
        userRepo.save(user);
        return "welcome";
    }
}

