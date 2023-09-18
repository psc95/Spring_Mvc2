package net.daum.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.daum.vo.MemberVO;

@Repository
public class MemberMapperDAOImpl implements MemberMapper {
	
	@Autowired
	private SqlSession sqlSession; //mybatis 쿼리문 수행할 sqlSession 자동 의존성 주입(DI)

	@Override
	public MemberVO readMember(String userid) {
		
		return this.sqlSession.selectOne("readMem",userid); //mybatis에서 selectOne()
		//메서드는 단 한개의 레코드값만 읽어옴, readMem는 security.xml 매퍼태그에서 설정할 유일 아이디명이다.
	}
	
}
