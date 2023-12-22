package com.training.project.FinalProject.Services;

import java.util.List;

import com.training.project.FinalProject.Entity.LoanApplication;
import com.training.project.FinalProject.Excepton.BusinessException;

public interface LoanApplicationService {
    List<LoanApplication> getAllLoanApplications();
    void updateLoanApplicationStatus(Long loanApplicationId, String status) throws BusinessException;
}

