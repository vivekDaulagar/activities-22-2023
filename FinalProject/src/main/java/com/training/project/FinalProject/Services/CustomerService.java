package com.training.project.FinalProject.Services;

import com.training.project.FinalProject.Entity.Customer;
import com.training.project.FinalProject.Excepton.BusinessException;

public interface CustomerService {
    Customer save(Customer customer) throws BusinessException;

	Customer registerCustomer(Customer registrationDto);

	Customer loginCustomer(String email, String password);
   
  
}

