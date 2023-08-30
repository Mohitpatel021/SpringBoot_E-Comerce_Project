package com.projecttask.projecttask.Controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projecttask.projecttask.Model.AddProduct;
import com.projecttask.projecttask.Repository.AddProduct_Repo;



@Controller
public class CartController {
  
  @Autowired
  private AddProduct_Repo addProduct_Repo;
  


  private List<AddProduct> cartItems = new ArrayList<>();

  @GetMapping("/myCart")
    public String viewCart(Model model) {
         model.addAttribute("totalAmount", calculateTotalAmount());
        if(calculateTotalAmount()!=0){
        model.addAttribute("cartItems", cartItems);
        }
        else{
            
        String empty="Your Cart Is Empty";
            model.addAttribute("emptyCart", empty);
        }
        return "myCart";
    }

    @GetMapping("/add-to-cart")
    public String addToCart(@RequestParam("product_id") Integer productId) {
        AddProduct product = addProduct_Repo.findById(productId).orElse(null);
        
        if (product != null) {
            cartItems.add(product);

        }
        return "redirect:/shop";
    }

     @GetMapping("/remove-from-cart")
public String removeFromCart(@RequestParam("product_id") Integer productId) {
    boolean removed = false;
    for (AddProduct item : cartItems) {
        if (item.getProduct_id().equals(productId)) {
            cartItems.remove(item);
            removed = true;
            break;
        }
    }
    if (removed) {
        return "redirect:/myCart";
    } else {
        // Item not found in the cart
        return "redirect:/myCart"; // or handle the error condition as desired
    }
}


    private double calculateTotalAmount() {
        double totalAmount = 0;
        for (AddProduct item : cartItems) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }
}
