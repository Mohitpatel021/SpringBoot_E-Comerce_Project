package com.projecttask.projecttask.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projecttask.projecttask.Model.Payment;
import com.projecttask.projecttask.Repository.Payment_Repo;


@Controller
public class Pay {
    
    @Autowired
    private Payment_Repo Payment_Repo;

@GetMapping("/payment")
    
    public String payment(){
        return "payment";
    }
    @PostMapping("/payment")
    public String saveUser(Payment newPayment) {
        System.out.println("*********");
        System.out.println("Data Inserted");
        System.out.println("**********");
        Payment_Repo.save(newPayment);
        System.out.println("***********************************************************************************************************************************************************");
        System.out.println("User product data......"+newPayment.toString());
        System.out.println("***********************************************************************************************************************************************************");
        System.out.println("***********************************************************************************************************************************************************");
        System.out.println("***********************************************************************************************************************************************************");
        
        return "OrderSuccessful";
        
    }
}