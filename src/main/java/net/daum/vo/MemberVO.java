package net.daum.vo;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;

@Data //setter(),getter(),toString()등 메서드 자동 제공
public class MemberVO {//데이터 저장 빈 클래스
	
	private String userid; //회원아이디
	private String userpw; //회원비번
	private String userName; //회원이름 => userName,regDate,updateDate 빈클래스 변수명은
	//해당 테이블 컬럼명과 다르다.
	private boolean enabled;
	
	private Timestamp regDate; //가입날짜
	private Timestamp updateDate; //수정날짜
	private List<AuthVO> authList; //권한 목록
}
