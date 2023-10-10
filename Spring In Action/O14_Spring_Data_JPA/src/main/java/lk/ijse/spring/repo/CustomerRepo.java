package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {

    //Spring Query Methods
    List<Customer> findCustomerByAddress(String address);

    Customer findByAddress(String address);
    Customer readByAddress(String address);
    Customer getByAddress(String address);
    Customer queryByAddress(String address);
    Customer searchByAddress(String address);
    Customer streamByAddress(String address);


    Long countByAddress(String address);


    Customer findBySalaryAndName(String salary,String name);


    //Native SQL Supported
    @Query(value = "select * from Customer",nativeQuery = true)
    List<Customer> getAllCustomers();


}
