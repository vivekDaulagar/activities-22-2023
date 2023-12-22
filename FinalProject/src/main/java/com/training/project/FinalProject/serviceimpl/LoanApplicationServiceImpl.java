package com.training.project.FinalProject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.project.FinalProject.Dao.LoanApplicationRepository;
import com.training.project.FinalProject.Entity.LoanApplication;
import com.training.project.FinalProject.Excepton.BusinessException;
import com.training.project.FinalProject.Services.LoanApplicationService;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {

    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    @Override
    public List<LoanApplication> getAllLoanApplications() {
        return loanApplicationRepository.findAll();
    }

    @Override
    public void updateLoanApplicationStatus(Long loanApplicationId, String status) throws BusinessException {
        try {
            LoanApplication loanApplication = loanApplicationRepository.findById(loanApplicationId)
                    .orElseThrow(() -> new BusinessException("Loan application not found with ID: " + loanApplicationId));

            loanApplication.setStatus(status);

            loanApplicationRepository.save(loanApplication);

        } catch (Exception e) {
            throw new BusinessException("Error occurred while updating loan application status", e);
        }
    }

}

