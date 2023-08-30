package com.projecttask.projecttask.Repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.projecttask.projecttask.Model.AddProduct;

public interface AddProduct_Repo extends JpaRepository<AddProduct,Integer>{
    
}

