package com.digitalcode.pdf2html.service;

import org.springframework.stereotype.Service;

import com.aspose.pdf.Document;
import com.aspose.pdf.SaveFormat;

@Service
public class ConvertPdfToHtmlService {

	public String convertPdfToHtml(String pdfFilePath) {
		// load PDF with an instance of Document
		Document document = new Document(pdfFilePath);
		//split path and get file name
		if(pdfFilePath!=null) {
		String[] fullPath=pdfFilePath.split("\\\\");
		String fileName=fullPath[fullPath.length-1];
		String[] fileNameOutputTab=fileName.split("\\.");
		// save document in HTML format
		document.save(fileNameOutputTab[0]+".html", SaveFormat.Html);
		}
		return "Done";
	}
}
