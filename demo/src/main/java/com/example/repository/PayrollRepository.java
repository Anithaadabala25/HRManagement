package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {
	
}
