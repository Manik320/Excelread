package com.example.excelexample.repsitory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.excelexample.model.ExcelData;

public interface ExcelRepository extends JpaRepository<ExcelData, Long> {


 
}

