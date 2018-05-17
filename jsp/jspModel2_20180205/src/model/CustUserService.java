package model;

import java.util.List;

import DTO.CustUserBean;

public class CustUserService { //singleton --> Spring 에서는 Autowired
	private static CustUserService custUserService = null;
	public iCustUserManager manager;
	
	private CustUserService() {
		manager = new CustUserManager();
	}
	
	public static CustUserService getInstance() {
		if(custUserService == null) {
			custUserService = new CustUserService();
		}
		return custUserService;
	}
	
	public List<CustUserBean> getcustUserList() {
		return manager.getcustUserList();
	}
	
	public int addCustUser(String id, String name, String address) {
		return manager.addCustUser(id, name, address);
	}
	
	public CustUserBean getcustUserDetail(String id) {
		return manager.getcustUserDetail(id);
	}
	
	public boolean deleteCustUser(String[] ids) {
		return manager.deleteCustUser(ids);
	}
	
	
}
