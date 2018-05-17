package bbs;

public class PagingBean {
	private int nowPage; //현재 페이지
	private int startNum; //현재 첫 페이지의 row번호
	private int totalCount; //게시판의 총 글수
	private int countPerPage; // 페이지당 보여 줄 글의 갯수
	private int blockCount; // paging page 숫자의 블록 카운트
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getCountPerPage() {
		return countPerPage;
	}
	public void setCountPerPage(int countPerPage) {
		this.countPerPage = countPerPage;
	}
	public int getBlockCount() {
		return blockCount;
	}
	public void setBlockCount(int blockCount) {
		this.blockCount = blockCount;
	}

}
