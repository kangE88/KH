package kh.com.a.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.com.a.dao.KhMemberDao;
import kh.com.a.model.MemberDto;

@Repository
public class KhMemberDaoImpl implements KhMemberDao {

	@Autowired //자동생성
	SqlSession sqlSession; //DI, Ioc

	private String namespce = "KHMember.";
	
	@Override
	public boolean addmember(MemberDto mem) throws Exception {
		
		int n = sqlSession.insert(namespce+ "addmember", mem);
		return n>0?true:false;
	}

	@Override
	public MemberDto login(MemberDto mem) {
		MemberDto memDto = sqlSession.selectOne(namespce+"login", mem);
		
		System.out.println("login==>"+memDto.toString());
		return memDto;
	}
	
	
	
}
