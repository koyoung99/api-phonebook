package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PersonVo;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;

	// 리스트
//	@ResponseBody
	@GetMapping("/api/list")
	public List<PersonVo> list() {
		System.out.println("PhonebookController.list()");

		List<PersonVo> phonebookList = phonebookService.exeList();

		return phonebookList;
	}

	// 등록
	@PostMapping("/api/write")
	public int add(@RequestBody PersonVo personVo) {
		System.out.println("PhonebookController.write()");

		int count = phonebookService.exeInsert(personVo);

		return count;
	}

	// 삭제
	// @ResponseBody
	@DeleteMapping(value = "/api/{personId}")
	public int remove(@PathVariable(value = "personId") int no) {
		System.out.println("PhonebookController.remove()");
		System.out.println(no);

		int count = phonebookService.exeRemove(no);

		return count;
	}

	// 수정폼
	@GetMapping(value = "/api/{personId}")
	public PersonVo modifyForm(@PathVariable(value = "personId") int no) {
		System.out.println("PhonebookController.modifyForm()");

		PersonVo personVo = phonebookService.exeModifyForm(no);

		return personVo;
	}

	// 수정
	@GetMapping(value = "/api/modify")
	public int modify() {
		System.out.println("PhonebookController.modify");

		int count = phonebookService.exeModify(personVo);

		return count;
	}

}
