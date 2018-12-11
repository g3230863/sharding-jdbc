package com.hjc.sharding.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjc.sharding.demo.entity.Member;
import com.hjc.sharding.demo.mapper.MemberMapper;

/**
 * Created with Intellij IDEA.
 * @author hjc
 * @version 2018/5/31
 */
@Service
public class MemberService  {
	
	@Autowired
	private MemberMapper memberMapper;

    @Transactional(rollbackFor = Exception.class)
    public void save(Member member) {
          memberMapper.insert(member);
    }
    
    public Member  selectById(String id) {
    	return  memberMapper.selectById(id);
    }
}