package kh.com.a.dao;

import java.util.List;

import kh.com.a.model.BbsDto;

public interface KhBbsDao {
	List<BbsDto> getBbsList() throws Exception;
	BbsDto getBBS(int seq) throws Exception;	
	void readCount(int seq) throws Exception;
	boolean writeBbs(BbsDto dto) throws Exception;
	
}
