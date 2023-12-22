package com.training.project.FinalProject.Services;

public interface SecurityService {
    void logLoginAttempt(String email, boolean success);
    void logAudit(String details);
    
}

