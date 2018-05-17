package kh.com.a.model;

import java.io.Serializable;

/*
	DROP TABLE POLLSUB
	CASCADE CONSTRAINTS;
	
	DROP SEQUENCE POLLSUB_SEQ;
	 
	
	CREATE TABLE POLLSUB(
		POLLSUBID NUMBER NOT NULL,
		POLLID NUMBER NOT NULL,
		ANSWER VARCHAR2(1000) NOT NULL,
		ACOUNT NUMBER NOT NULL,
		CONSTRAINT POLLSUB_PK PRIMARY KEY("POLLSUBID")
	)
	
	CREATE SEQUENCE POLLSUB_SEQ
	START WITH 1 INCREMENT BY 1;
	
	ALTER TABLE POLLSUB ADD CONSTRAINT POLLSUB_FK
	FOREIGN KEY("POLLID")
	REFERENCES POLL("POLLID");

 */


//선택항목들(보기) 사과, 배, 바나나
public class PollSubDto implements Serializable {
	private int pollsubid; 	// 보기 나온 순서에 대한 번호
	private int pollid;		// 질문번호
	private String answer;	// 보기내용
	private int acount;		// 현재 보기를 선택한 사람 수
	
	public PollSubDto() {
	}

	public PollSubDto(int pollsubid, int pollid, String answer, int acount) {
		super();
		this.pollsubid = pollsubid;
		this.pollid = pollid;
		this.answer = answer;
		this.acount = acount;
	}

	public int getPollsubid() {
		return pollsubid;
	}

	public void setPollsubid(int pollsubid) {
		this.pollsubid = pollsubid;
	}

	public int getPollid() {
		return pollid;
	}

	public void setPollid(int pollid) {
		this.pollid = pollid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getAcount() {
		return acount;
	}

	public void setAcount(int acount) {
		this.acount = acount;
	}

	@Override
	public String toString() {
		return "PollSubDto [pollsubid=" + pollsubid + ", pollid=" + pollid + ", answer=" + answer + ", acount=" + acount
				+ "]";
	}
	
}
