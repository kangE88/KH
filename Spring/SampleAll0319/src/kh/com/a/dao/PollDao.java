package kh.com.a.dao;

import java.util.List;

import kh.com.a.model.PollDto;
import kh.com.a.model.PollSubDto;
import kh.com.a.model.Voter;

public interface PollDao {
	
	public List<PollDto> getPollAlllist();
	
	public int isVote(Voter voter);
	
	public void makePoll(PollDto poll);
	public void makePollSub(PollSubDto pollsub);
	
	PollDto getPoll(PollDto poll);
	List<PollSubDto> getPollSubList(PollDto poll);
	
	public void pollingVote(Voter voter); 	//	투표자
	public void pollingPoll(Voter voter);	//	질문
	public void pollingSub(Voter voter);	//	보기

}
