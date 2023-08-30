package com.projecttask.projecttask.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projecttask.projecttask.Model.UserSignup;

public interface UserSignup_Repo extends JpaRepository<UserSignup,String>{

    UserSignup_Repo findByEmail(String email);

    UserSignup_Repo findByPassword(String password);

    UserSignup findByEmailAndPassword(String email, String password);
    
}
