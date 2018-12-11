package com.hjc.sharding.demo.mapper;

import com.hjc.sharding.demo.entity.Member;

/**
 * Created with Intellij IDEA.
 * @author hjc
 * @version 2018/5/31
 */
public interface MemberMapper {
	
	public void insert(Member m);
	
	public Member selectById(String id);


}
