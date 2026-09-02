package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.AuthorityMapper;
import com.sist.web.mapper.MemberMapper;
import com.sist.web.vo.AuthorityVO;
import com.sist.web.vo.MemberVO;

import lombok.RequiredArgsConstructor;
/*
 * 			 |Security
 *    User <----> Controller <----> Service <----> Repository ---- DB
 *    => 의존성이 낮은 프로그램
 *     
 * 
 * 
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	private final MemberMapper mMapper;
	private final AuthorityMapper aMapper;
	@Override
	public List<AuthorityVO> getAuthorityData(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberVO findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
