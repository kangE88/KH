package kh.com.a.service;

import java.util.List;

import kh.com.a.model.BbsDto;

public interface KhBbsService {
	public List<BbsDto> getBbsList() throws Exception;
	public	BbsDto getBBS(int seq) throws Exception;	
	public void readCount(int seq) throws Exception;
	public boolean writeBbs(BbsDto dto) throws Exception;
}
