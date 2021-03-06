package com.quizapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizapp.models.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByusername(String username);
	Admin getById(Long Id);
	void deleteById(Long Id);
}
