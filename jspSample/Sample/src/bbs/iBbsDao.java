package bbs;

import java.util.List;

public interface iBbsDao {
	public boolean writeBbs(BbsDto dto);
	public List<BbsDto> getBbsList();
	
	public BbsDto getBBS(int seq);	
	public void readCount(int seq);
	
	public boolean answer(int seq, BbsDto bbs);
	public List<BbsDto> getBbsPagingList(PagingBean paging, String searchWord);
	
	public boolean Modify(int seq, String title, String content);
}
