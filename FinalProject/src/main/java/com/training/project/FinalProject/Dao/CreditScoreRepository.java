package com.training.project.FinalProject.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.FinalProject.Entity.CreditScore;
import com.training.project.FinalProject.Entity.Customer;

@Repository
public interface CreditScoreRepository extends JpaRepository<CreditScore, Long> {
    Optional<CreditScore> findByCustomer(Customer customer);
}

