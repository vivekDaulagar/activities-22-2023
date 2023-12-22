package com.training.project.FinalProject.Services;

import org.springframework.web.multipart.MultipartFile;

import com.training.project.FinalProject.Excepton.BusinessException;

public interface DocumentService {
    void uploadDocument(Long customerId, MultipartFile document) throws BusinessException;
}

