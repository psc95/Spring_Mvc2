package net.daum.vo;

import lombok.Data;

@Data
public class AuthVO {//tbl_member_auth 테이블의 컬럼명과 일치하는 데이터 저장 빈 클래스 생성
	
	private String userid;
	private String auth;
}
