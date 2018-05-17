package kh.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.com.a.dao.PdsDao;
import kh.com.a.model.PdsDto;
import kh.com.a.service.PdsService;

@Service
public class PdsServiceImpl implements PdsService {

	@Autowired
	private PdsDao pdsDao;
	
	@Override
	public List<PdsDto> getPdsList() {		
		return pdsDao.getPdsList();
	}

	@Override
	public void uploadPds(PdsDto dto) {
		pdsDao.uploadPds(dto);
	}

	@Override
	public PdsDto getpds(int seq) {
		return pdsDao.getpds(seq);
	}

	@Override
	public boolean downCountInc(int seq) {
		return pdsDao.downCountInc(seq);
	}

	@Override
	public void delPds(int seq) {
		pdsDao.delPds(seq);
		
	}	
	
	
	
	
}


