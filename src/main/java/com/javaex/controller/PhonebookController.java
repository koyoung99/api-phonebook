package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PersonVo;

@RestController
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;

//	@ResponseBody
	@GetMapping("/api/list")
	public List<PersonVo> list() {
		System.out.println("PhonebookController.list()");

		List<PersonVo> phonebookList=phonebookService.exeList();
		
		return phonebookList;
	}

}
