package com.projecttask.projecttask.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projecttask.projecttask.Model.AdminLogin;

public interface AdminLogin_Repo extends JpaRepository<AdminLogin,String>{
    AdminLogin_Repo findByAdmin(String admin);
    AdminLogin_Repo findByPassword(String password);

    AdminLogin findByAdminAndPassword(String admin, String password);
    
}

