package com.vwit.fileupload.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class FileUploadRestController {

	@PostMapping("/file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile multipartFile){
		ResponseEntity<String> re = new ResponseEntity<String>(HttpStatus.OK);
		System.out.println(multipartFile.getSize());
		System.out.println(multipartFile.getName());
		return re;
	}
}
