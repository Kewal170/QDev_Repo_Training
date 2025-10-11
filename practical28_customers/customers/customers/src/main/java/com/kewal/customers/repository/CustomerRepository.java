package com.kewal.customers.repository;

import com.kewal.customers.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Customer entity.
 * Provides CRUD operations using JpaRepository.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
