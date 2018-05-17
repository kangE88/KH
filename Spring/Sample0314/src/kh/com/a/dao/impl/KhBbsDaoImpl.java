package kh.com.a.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.com.a.dao.KhBbsDao;
import kh.com.a.model.BbsDto;

@Repository
public class KhBbsDaoImpl implements KhBbsDao{

	@Autowired
	SqlSession sqlSession;
	
	private String ns = "KHBbs.";
	
	@Override
	public List<BbsDto> getBbsList() throws Exception {

		System.out.println("sqlSession.getConfiguration()..getDefaultExecutorType()==>"+sqlSession.getConfiguration().getDefaultExecutorType());
		
		List<BbsDto> bbsList = new ArrayList<BbsDto>();
		
		bbsList = sqlSession.selectList(ns+"getBbsList"); 
		
		return bbsList;
	}

	@Override
	public BbsDto getBBS(int seq) {
		
		BbsDto dto = sqlSession.selectOne(ns+"getBBS", seq);
		
		return dto;
	}

	@Override
	public void readCount(int seq) {		
		sqlSession.update(ns+"readCount", seq);
	}

	@Override
	public boolean writeBbs(BbsDto dto) throws Exception {
		int count = 0;

		count = sqlSession.insert(ns+"writeBbs", dto);

		return count>0?true:false;
	}

}
