package com.training.project.FinalProject.Services;

import java.util.List;

import com.training.project.FinalProject.Entity.CreditScore;
import com.training.project.FinalProject.Entity.LoanApplication;
import com.training.project.FinalProject.Entity.LoanOfficer;
import com.training.project.FinalProject.Excepton.BusinessException;

public interface LoanOfficerService {
    LoanApplication loginLoanOfficer(String employeeId, String password) throws BusinessException;
    List<LoanApplication> viewLoanApplications();
    void updateLoanApplicationStatus(Long loanApplicationId, String status) throws BusinessException;
    List<CreditScore> viewCreditScores(String customerPan) throws BusinessException;
}

