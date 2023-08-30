package com.projecttask.projecttask.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projecttask.projecttask.Model.AddProduct;
import com.projecttask.projecttask.Model.AdminLogin;
import com.projecttask.projecttask.Repository.AddProduct_Repo;
import com.projecttask.projecttask.Repository.AdminLogin_Repo;



@Controller
public class AdminController {

    @Autowired
    private AdminLogin_Repo adminLoginRepo;

    @Autowired
    private AddProduct_Repo addProduct_Repo;

    @GetMapping("/adminlogin")
    public String adminLogin() {
        
        return "adminLogin";
    }

    @PostMapping("/admin_login")
    public String adminLoginDetails(@RequestParam("admin") String admin, @RequestParam("password") String password, Model model) {
        AdminLogin adminn = adminLoginRepo.findByAdminAndPassword(admin,password);

        if (adminn != null) {
            return "adminController";
        } else {
            
            return "adminLogin";
        }
    }

   @RequestMapping("//shop")
    public String adminView()
    {
        return "shop" ;
    }

    
     @RequestMapping("/adminController")
    public String adminController()
    {
        return "adminController";
    }

    //adding product
     @RequestMapping("/addProduct")
    public String addProdoctPage()
    {
        return "addProduct";
    }
          @PostMapping("/shop")
    public String productRgister(AddProduct addedProduct){
        addProduct_Repo.save(addedProduct);
        return "redirect:/productController";
    }

   
     @GetMapping("/productController")
    public String saveproductadmin(Model model){
        List<AddProduct> products=addProduct_Repo.findAll();
        model.addAttribute("products", products);
        return "productController";
    }

     @GetMapping("/shop")
    public String productadmin(Model model){
        List<AddProduct> products=addProduct_Repo.findAll();
        model.addAttribute("products", products);
        return "shop";
    }

    //deleting product
     @PostMapping("/delete_user")
    public String deleteUser(@RequestParam("product_id") Integer id, Model model){
        addProduct_Repo.deleteById(id);
        return "redirect:/productController";
    }

    
    @GetMapping("/delete_user")
    public String deleteproductadmin(Model model){
        List<AddProduct> products=addProduct_Repo.findAll();
        model.addAttribute("products", products);
        return "shop";
    }

    //update

      @GetMapping("/update-user")
public String updateUser(@RequestParam("product_id") Integer product_id, Model model) {
    AddProduct product = addProduct_Repo.findById(product_id).orElse(null);
    if (product != null) {
        model.addAttribute("product", product);
        return "updateuser";
    } else {
        return "productController";
    }
}

@PostMapping("/addProduct")
public String saveUser(@ModelAttribute("product") AddProduct updatedProduct, Model model) {
    addProduct_Repo.save(updatedProduct);
    List<AddProduct> products = addProduct_Repo.findAll();
    model.addAttribute("product", products);
    return "shop";
}



}

