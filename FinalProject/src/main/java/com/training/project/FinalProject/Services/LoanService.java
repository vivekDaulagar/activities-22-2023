package com.training.project.FinalProject.Services;

import java.util.List;

import com.training.project.FinalProject.Entity.Loan;
import com.training.project.FinalProject.Excepton.BusinessException;

public interface LoanService {
    List<Loan> getAllLoans();
    Loan applyForLoan(Long customerId, int loanType) throws BusinessException;
 
}

