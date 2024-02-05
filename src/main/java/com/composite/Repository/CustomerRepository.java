package com.composite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.composite.Entity.CustomerEntity;
import com.composite.Entity.CustomerPk;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, CustomerPk> {

	
	CustomerEntity findByName(String name);

	
	

	
	
}
