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
	
	// 등록
		public int personInsert(PersonVo personVo) {
			System.out.println("PhonebookDao.personInsert()");

			int count = sqlSession.insert("phonebook.insert", personVo);

			return count;
		}

		// 삭제
		public int personbookDelete(int no) {
			System.out.println("PhonebookDao.personbookDelete()");

			int count = sqlSession.delete("phonebook.delete", no);

			return count;
		}

		// 수정폼
		public PersonVo personSelectOne(int no) {
			System.out.println("PhonebookDao.personSelectOne()");

			PersonVo personVo = sqlSession.selectOne("phonebook.selectOne", no);

			return personVo;
		}

		// 수정
		public int personUpdate(PersonVo personVo) {
			System.out.println("PhonebookDao.personUpdate()");

			int count = sqlSession.update("phonebook.update", personVo);

			return count;
		}
	
	
}
