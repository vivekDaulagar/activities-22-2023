package com.training.project.FinalProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.FinalProject.Entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}

