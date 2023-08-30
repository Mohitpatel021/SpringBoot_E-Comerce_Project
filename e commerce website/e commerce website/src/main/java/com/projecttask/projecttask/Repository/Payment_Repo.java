package com.projecttask.projecttask.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projecttask.projecttask.Model.Payment;

public interface Payment_Repo extends JpaRepository<Payment,Integer>{
    
}