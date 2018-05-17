package kh.com.a.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.com.a.dao.PollDao;
import kh.com.a.model.PollBean;
import kh.com.a.model.PollDto;
import kh.com.a.model.PollSubDto;
import kh.com.a.model.Voter;
import kh.com.a.service.PollService;

@Service
public class PollServiceImpl implements PollService {

	@Autowired
	private PollDao pollDao;
	
	@Override
	public List<PollDto> getPollAlllist(String id) {
		
		List<PollDto> plists = pollDao.getPollAlllist();  // get용
		List<PollDto> plists2 = new ArrayList<PollDto>();	// return용
		
		for (PollDto poll : plists) {
			
			int pollid = poll.getPollid();	// 투표번호
			
			int count = pollDao.isVote(new Voter(pollid, -1, id));
			// 로그인한 본인이 투표를 했는지 카운터한다 
			
			if(count > 0) {
				poll.setVote(true); // 투표했다
			}else {
				poll.setVote(false); // 투표안했다
			}
			plists2.add(poll);			
		}
		
		return plists2;
	}

	@Override
	public void makePoll(PollBean pbeen) {
		// 투표 제목
		PollDto poll = new PollDto(pbeen.getId(), pbeen.getQuestion(), pbeen.getSdate(), pbeen.getEdate(), pbeen.getItemcount(), 0);
		
		pollDao.makePoll(poll);
		
		// 보기
		int itemCount = pbeen.getItemcount();	//보기 갯수
		
		String answer[] = pbeen.getPollnum();	// 보기 문자열
		
		for(int i=0; i<itemCount; i++) {
			PollSubDto pollsub = new PollSubDto();
			pollsub.setAnswer(answer[i]);
			pollDao.makePollSub(pollsub);
		}
	}

	@Override
	public PollDto getPoll(PollDto poll) {
		return pollDao.getPoll(poll);
	}

	@Override
	public List<PollSubDto> getPollSubList(PollDto poll) {
		return pollDao.getPollSubList(poll);
	}

	@Override
	public void polling(Voter voter) {
		pollDao.pollingVote(voter);
		pollDao.pollingPoll(voter);
		pollDao.pollingSub(voter);
	}


	
	
	
}
