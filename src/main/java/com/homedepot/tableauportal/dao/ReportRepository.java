package com.homedepot.tableauportal.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.homedepot.tableauportal.entity.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
//	Page<Report> findByName(@RequestParam("name") String name, Pageable pageable);
}
