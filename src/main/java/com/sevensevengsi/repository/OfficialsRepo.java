package com.sevensevengsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sevensevengsi.model.Officials;

@Repository
public interface OfficialsRepo extends JpaRepository<Officials, Long> {

}
