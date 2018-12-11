package com.hjc.sharding.demo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hjc.sharding.demo.entity.Member;
import com.hjc.sharding.demo.service.MemberService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcDemoApplicationTests {

	  @Autowired
	private MemberService memberService;
	
	@Test
	public void contextLoads() {
		Member member=new Member();
		member.setId("4");
		member.setMobile("223");
		member.setName("442");
		memberService.save(member);
		
		Member m=memberService.selectById("5");
		System.out.println(m.toString());
		
	}

}
