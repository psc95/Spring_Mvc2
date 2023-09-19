package net.daum.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import net.daum.dao.MemberMapper;
import net.daum.security.domain.CustomUser;
import net.daum.vo.MemberVO;

public class CustomUserDetailsService implements UserDetailsService {
//스프링 시큐리티 자동 로그인과 관련된 클래스
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		System.out.println("전달되어지는 아이디 : "+username);
		
		MemberVO vo = this.memberMapper.readMember(username);//아이디를 기준으로
		//DB로 부터 회원 정보 검색
		System.out.println("DB로 부터 검색된 회원정보 : "+vo);
		return vo==null?null:new CustomUser(vo);
	}

}
