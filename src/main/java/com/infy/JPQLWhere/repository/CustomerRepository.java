package com.infy.JPQLWhere.repository;

import com.infy.JPQLWhere.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepository {
    public List<CustomerDTO> getCustomerDetails(Integer customerId);
}
