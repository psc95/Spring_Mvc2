package net.daum.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import net.daum.vo.MemberVO;

public class CustomUser extends User {//스프링 시큐리티 자동 로그인을 만들기 위해서 인증관리자에서
	//필요한 클래스
	
	private MemberVO member;
	
	public CustomUser(String username, String password,
			Collection<? extends GrantedAuthority> authorities) {
		 // GrantedAuthority를 상속받은 자손타입으로만 제네릭 타입 형변환을 허용한다라는 뜻의 제네릭 와이들
		 // 카드 문법이다.
		super(username,password,authorities);
	}
	
	public CustomUser(MemberVO vo) {
		super(vo.getUserid(), vo.getUserpw(), vo.getAuthList().parallelStream()
				.map(auth-> new SimpleGrantedAuthority(auth.getAuth())).collect(
						Collectors.toList()));
		/* 검색된 아이디,비번,권한목록을 스트림 객체를 생성한 다음 정보를 수집해서 SimpleGrantedAuthority
		 * 생성자를 호출해서 값을 전달함.
		 */
		this.member=vo;
	}
}
