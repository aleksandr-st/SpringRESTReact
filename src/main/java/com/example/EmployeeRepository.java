package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sasha on 28.01.2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
