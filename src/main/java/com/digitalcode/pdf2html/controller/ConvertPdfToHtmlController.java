package com.digitalcode.pdf2html.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalcode.pdf2html.service.ConvertPdfToHtmlService;

@RestController
@RequestMapping("api/convert")
public class ConvertPdfToHtmlController {
	
	@Autowired
	ConvertPdfToHtmlService convertPdfToHtmlService; 
	
	@GetMapping(value = "/pdf2html")
	public String convertPdfToHtml(@RequestParam(name = "filePath", required = false, defaultValue = "null") String filePath) {
		return convertPdfToHtmlService.convertPdfToHtml(filePath); 
	}

}
