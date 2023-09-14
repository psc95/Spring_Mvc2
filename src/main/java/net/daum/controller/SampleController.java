package net.daum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/*") //컨트롤러 자체 매핑주소 등록
public class SampleController {
	
	@GetMapping("/all") //get으로 접근하는 매핑주소를 처리, all 매핑주소 등록 => 로그인 하지 않은 사용자도
	//접근 가능한 매핑주소이다.
	public void doAll() {
		//리턴 타입이 없는 void형이면 매핑주소인 all이 뷰페이지 파일명이 된다.=> 뷰페이지 경로는 /WEB-INF/
		// views/sample/all.jsp
		
		System.out.println("do all can access everyBody");
	}//doAll()
	
	@GetMapping("/member") //로그인 한 사용자들만이 접근 가능한 매핑주소
	public void doMember() {
		System.out.println("logined member");
	}
	
	@GetMapping("/admin") //로그인 한 사용자들 중에서 관리자 권한을 가진 admin만 접근 가능한 매핑주소이다.
	public void doAdmin() {
		System.out.println("admin only");
	}//doAdmin()
}
