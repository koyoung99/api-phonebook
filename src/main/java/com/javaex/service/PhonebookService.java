package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;
import com.javaex.vo.PersonVo;

@Service
public class PhonebookService {

	@Autowired
	private PhonebookDao phonebookDao;

	// 리스트
	public List<PersonVo> exeList() {
		System.out.println("PhonebookService.phonebookService");

		List<PersonVo> phonebookList = phonebookDao.personSelectList();

		return phonebookList;
	}

	// 등록
	public int exeInsert(PersonVo personVo) {
		System.out.println("PhonebookService.exeInsert()");

		int count = phonebookDao.personInsert(personVo);

		return count;
	}

	// 삭제
	public int exeRemove(int no) {
		System.out.println("GuestbookService.exeRemove()");

		int count = phonebookDao.personbookDelete(no);

		return count;
	}
	
	// 수정폼
	public PersonVo exeModifyForm(int no) {
		System.out.println("PhonebookService.exeModifyForm()");
		
		PersonVo personVo=phonebookDao.personSelectOne(no);
		
		return personVo;
	}
}
