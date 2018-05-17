package kh.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.com.a.dao.KhBbsDao;
import kh.com.a.model.BbsDto;
import kh.com.a.service.KhBbsService;

@Service
public class KhBbsServiceImpl implements KhBbsService {

	@Autowired
	KhBbsDao KhBbsDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<BbsDto> getBbsList() throws Exception {
		return KhBbsDao.getBbsList();
	}

	@Override
	public BbsDto getBBS(int seq) throws Exception {
		return KhBbsDao.getBBS(seq);
	}

	@Override
	public void readCount(int seq) throws Exception {
		KhBbsDao.readCount(seq);
	}

	@Override
	public boolean writeBbs(BbsDto dto) throws Exception {
		return KhBbsDao.writeBbs(dto);
	}



}
