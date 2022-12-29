package com.sevensevengsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sevensevengsi.model.Manager;

@Repository
public interface ManagerRepo extends JpaRepository<Manager, Long> {

}
