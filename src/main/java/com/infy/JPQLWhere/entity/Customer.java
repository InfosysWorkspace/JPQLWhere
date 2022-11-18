package com.infy.JPQLWhere.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Customer {
    @Id
    private Integer customerId;
    private String emailId;
    private String name;
    private LocalDate dateOfBirth;
    private String city;

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Integer customerId) {
        this.customerId = customerId;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(final String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(final LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 0;
        result = prime * result + ((this.getCustomerId() == null) ? 0 : this.getCustomerId()
                .hashCode());
        return result;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;

        Customer other = (Customer) obj;
        if (this.getCustomerId() != null) {
            if (other.getCustomerId() != null)
                return false;
        } else if (!this.getCustomerId().equals(other.getCustomerId())) {
            return false;
        }
        return  true;
    }

    @Override
    public String toString(){
        return "Customer [customerId="+customerId+ ", name="+name+", emailId="+emailId+
                ", dateOfBirth="+dateOfBirth+", city="+city+ "]";
    }



}
