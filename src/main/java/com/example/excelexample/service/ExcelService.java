package com.example.excelexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.excelexample.model.ExcelData;
import com.example.excelexample.repsitory.ExcelRepository;

import java.util.List;

@Service
public class ExcelService {
    private final ExcelRepository excelRepository;

    @Autowired
    public ExcelService(ExcelRepository excelRepository) {
        this.excelRepository = excelRepository;
    }

    public List<ExcelData> getAllExcelData() {
        return excelRepository.findAll();
    }

    public void saveExcelData(ExcelData excelData) {
        excelRepository.save(excelData);
    }

    
}
