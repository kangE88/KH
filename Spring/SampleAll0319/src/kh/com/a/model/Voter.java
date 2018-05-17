package kh.com.a.model;

import java.io.Serializable;
import java.util.Date;


/*
	CREATE TABLE VOTER(
		VOTERID NUMBER NOT NULL,
		POLLID NUMBER,
		POLLSUBID NUMBER NOT NULL,
		ID VARCHAR2(50) NOT NULL,
		REGDATE DATE NOT NULL,
		CONSTRAINT VOTER_PK PRIMARY KEY("VOTERID")
	);
	
	CREATE SEQUENCE VOTER_SEQ
	START WITH 1 INCREMENT BY 1;
	
	ALTER TABLE VOTER ADD CONSTRAINT VOTER_FK
	FOREIGN KEY ("POLLID")
	REFERENCES POLL("POLLID"); 
	
	ALTER TABLE VOTER ADD CONSTRAINT VOTER_FK2
	FOREIGN KEY ("POLLSUBID")
	REFERENCES POLLSUB("POLLSUBID"); 
	
	ALTER TABLE VOTER ADD CONSTRAINT VOTER_FK3
	FOREIGN KEY ("ID")
	REFERENCES MEMBER("ID"); 
 */

//투표한 사람 (관리용)
public class Voter implements Serializable {
	private int voterid;	// 답한사람의 번호
	private int pollid;		// 질문 번호
	private int pollsubid;	// 선택한 보기 번호
	private String id;		// 답한 사람의 아이디
	private Date regidate;	// 투표한 날짜와 시간
	
	public Voter() {
	}
	
	public Voter(int voterid, int pollid, int pollsubid, String id, Date regidate) {
		super();
		this.voterid = voterid;
		this.pollid = pollid;
		this.pollsubid = pollsubid;
		this.id = id;
		this.regidate = regidate;
	}

	public Voter(int pollid, int pollsubid, String id) {
		super();
		this.pollid = pollid;
		this.pollsubid = pollsubid;
		this.id = id;
	}

	public int getVoterid() {
		return voterid;
	}

	public void setVoterid(int voterid) {
		this.voterid = voterid;
	}

	public int getPollid() {
		return pollid;
	}

	public void setPollid(int pollid) {
		this.pollid = pollid;
	}

	public int getPollsubid() {
		return pollsubid;
	}

	public void setPollsubid(int pollsubid) {
		this.pollsubid = pollsubid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getRegidate() {
		return regidate;
	}

	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}

	@Override
	public String toString() {
		return "VoterDto [voterid=" + voterid + ", pollid=" + pollid + ", pollsubid=" + pollsubid + ", id=" + id
				+ ", regidate=" + regidate + "]";
	}
}
