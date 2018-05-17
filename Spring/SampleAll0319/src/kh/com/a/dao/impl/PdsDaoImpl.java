package kh.com.a.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.com.a.dao.PdsDao;
import kh.com.a.model.PdsDto;

@Repository
public class PdsDaoImpl implements PdsDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	String ns = "Pds.";

	@Override
	public List<PdsDto> getPdsList() {		
		return sqlSession.selectList(ns + "getPdsList");		
	}

	@Override
	public void uploadPds(PdsDto dto) {
		sqlSession.insert(ns+"uploadPds", dto);
	}

	@Override
	public PdsDto getpds(int seq) {
		return sqlSession.selectOne(ns+"getPds", seq);
	}

	@Override
	public boolean downCountInc(int seq) {
		sqlSession.update(ns+"downCountInc", seq);		
		return true;
	}

	@Override
	public void delPds(int seq) {
		sqlSession.update(ns+"delPds", seq);
	}	
	
	
	
}





