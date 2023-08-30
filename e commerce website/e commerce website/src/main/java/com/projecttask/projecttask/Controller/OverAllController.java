package com.projecttask.projecttask.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OverAllController {
    @RequestMapping("/index")
    public String index()
    {
        return "index" ;
    }

    @RequestMapping("/login")
    public String loginPage()
    {
        return "login" ;
    }
    

    @RequestMapping("/brand")
    public String brandPage()
    {
        return "brand" ;
    }

    @RequestMapping("/my-info")
    public String infoPage()
    {
        return "my-info" ;
    }

    @RequestMapping("/ourteam")
    public String teamPage()
    {
        return "ourteam" ;
    }

    @RequestMapping("/contact")
    public String contactPage()
    {
        return "contact" ;
    }
   

    @RequestMapping("/admin")
    public String adminPage()
    {
        return "adminLogin" ;
    }

    @PostMapping("/submit-contact")
    public String submitresponseMsg(Model model){
        String msg="Thank you, Your Response is Submited";
        model.addAttribute("msg",msg );
        return "thankyou";
    }

    // @GetMapping("/thankyou")
    // public String responseMsg(){
    //     return "thankyou";

    // }


}

