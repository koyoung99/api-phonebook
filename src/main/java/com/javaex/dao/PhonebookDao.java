package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhonebookDao {

	@Autowired
	private SqlSession sqlSession;

	// 리스트
	public List<PersonVo> personSelectList() {
		System.out.println("PhonebookDao.exeList()");

		List<PersonVo> phonebookList = sqlSession.selectList("phonebook.select");
		System.out.println(phonebookList);

		return phonebookList;

	}

}
