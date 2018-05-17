package kh.com.a.dao;

import java.util.List;

import kh.com.a.model.PdsDto;

public interface PdsDao {

	public List<PdsDto> getPdsList();
	
	public void uploadPds(PdsDto dto);
	
	public PdsDto getpds(int seq);
	
	public boolean downCountInc(int seq);
	
	public void delPds(int seq);
}
