package dto;

import java.util.Date;

/*
create table membervo(
id varchar2(50) primary key,
pwd varchar2(50) not null,
email varchar2(50) not null,
phone varchar2(50) not null,
regdate date
)
*/

public class MemberVo {
	private String id;
	private String pwd;
	private String email;
	private String phone;
	private Date regdate;
	
	public MemberVo() {
	}

	public MemberVo(String id, String pwd, String email, String phone, Date regdate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
		this.regdate = regdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + ", email=" + email + ", phone=" + phone + ", regdate=" + regdate
				+ "]";
	}
	
}
