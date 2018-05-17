package model;

import java.util.List;

import DTO.CustUserBean;

public interface iCustUserManager {
	public List<CustUserBean> getcustUserList();
	public int addCustUser(String id, String name, String address);
	public CustUserBean getcustUserDetail(String id);
	public boolean deleteCustUser(String[] ids);
}
