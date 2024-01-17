package com.example.excelexample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.excelexample.model.ExcelData;
import com.example.excelexample.service.ExcelService;

import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExcelController {
 private final ExcelService excelService;

 @Autowired
 public ExcelController(ExcelService excelService) {
     this.excelService = excelService;
 }

 @GetMapping("/data")
 public List<ExcelData> getAllExcelData() {
     return excelService.getAllExcelData();
 }

 @PostMapping("/data")
 public void saveExcelData(@RequestBody ExcelData excelData) {
     excelService.saveExcelData(excelData);
 }

 // Implement other REST endpoints for Excel operations
}
