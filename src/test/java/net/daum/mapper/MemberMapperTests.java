package net.daum.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import net.daum.dao.MemberMapper;
import net.daum.vo.MemberVO;

@RunWith(SpringRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberMapperTests {

	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testRead() {
		MemberVO vo = this.mapper.readMember("admin90"); //admin90 회원아이디에
		//해당하는 회원정보를 읽어옴.
		
		System.out.println(vo);
		vo.getAuthList().forEach(authVO->System.out.println(authVO));
	}
}
