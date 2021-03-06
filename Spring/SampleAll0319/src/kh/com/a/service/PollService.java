package kh.com.a.service;

import java.util.List;

import kh.com.a.model.PollBean;
import kh.com.a.model.PollDto;
import kh.com.a.model.PollSubDto;
import kh.com.a.model.Voter;

public interface PollService {
	
	public List<PollDto> getPollAlllist(String id);
	
	public void makePoll(PollBean pbeen);
	
	PollDto getPoll(PollDto poll);
	List<PollSubDto> getPollSubList(PollDto poll);
	
	public void polling(Voter voter);

}
