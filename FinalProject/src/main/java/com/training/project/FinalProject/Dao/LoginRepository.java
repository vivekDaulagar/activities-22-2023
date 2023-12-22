package com.training.project.FinalProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.FinalProject.Entity.Login;
import com.training.project.FinalProject.Entity.LoginLog;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	void save(LoginLog loginLog);
}

