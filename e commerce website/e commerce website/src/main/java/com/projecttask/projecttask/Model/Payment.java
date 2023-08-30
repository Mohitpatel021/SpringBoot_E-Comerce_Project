package com.projecttask.projecttask.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue
    private Integer id;
    private String cardnumber;
    private String cardholder;
    private String cvv;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCardnumber() {
        return cardnumber;
    }
    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
    public String getCardholder() {
        return cardholder;
    }
    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
}
