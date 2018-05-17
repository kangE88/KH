package kh.com.a.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.com.a.dao.PollDao;
import kh.com.a.model.PollDto;
import kh.com.a.model.PollSubDto;
import kh.com.a.model.Voter;

@Repository
public class PollDaoImpl implements PollDao {
	private String ns ="Poll.";
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<PollDto> getPollAlllist() {
		List<PollDto> list = new ArrayList<PollDto>();		
		return list = sqlSession.selectList(ns + "getPollAlllist");
	}

	@Override
	public int isVote(Voter voter) {		
		return sqlSession.selectOne(ns + "isVote", voter);
	}

	@Override
	public void makePoll(PollDto poll) {
		sqlSession.insert(ns+"makePoll",poll);
	}

	@Override
	public void makePollSub(PollSubDto pollsub) {
		sqlSession.insert(ns+"makePollSub",pollsub);
	}

	@Override
	public PollDto getPoll(PollDto poll) {
		PollDto hp = sqlSession.selectOne(ns+"getPoll", poll);
		return hp;
	}

	@Override
	public List<PollSubDto> getPollSubList(PollDto poll) {
		List<PollSubDto> list = sqlSession.selectList(ns+"getPollSubList", poll);
		return list;
	}

	@Override
	public void pollingVote(Voter voter) {
		sqlSession.insert(ns+"pollingVote", voter);
	}

	@Override
	public void pollingPoll(Voter voter) {
		sqlSession.update(ns+"pollingPoll", voter);
	}

	@Override
	public void pollingSub(Voter voter) {
		sqlSession.update(ns+"pollingSub", voter);
	}
	
	

}
