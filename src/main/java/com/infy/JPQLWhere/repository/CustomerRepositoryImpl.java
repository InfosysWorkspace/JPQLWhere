package com.infy.JPQLWhere.repository;


import com.infy.JPQLWhere.dto.CustomerDTO;
import com.infy.JPQLWhere.entity.Customer;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CustomerDTO> getCustomerDetails(Integer customerId){
        List<CustomerDTO> customerDTOS = null;
        // Comments the below 3 lines while using named parameter
        String queryString = "select c from Customer c where c.customerId=?1";
        Query query = entityManager.createQuery(queryString);
        query.setParameter(1, customerId);

        // Uncomment the below code for using named parameter
        /*
        * String queryString = "select c from Customer c where c.customerId= :customerId";
        * Query query = entityManager.createQuery(queryString);
        * query.setParameter("customerId", customerId);
        */

        List<Customer> customers = query.getResultList();
        customerDTOS = new ArrayList<>();
        for(Customer customer : customers){
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustomerId(customer.getCustomerId());
            customerDTO.setName(customer.getName());
            customerDTO.setEmailId(customer.getEmailId());
            customerDTO.setDateOfBirth(customer.getDateOfBirth());
            customerDTO.setCity(customer.getCity());
        }
        return customerDTOS;
    }

}
