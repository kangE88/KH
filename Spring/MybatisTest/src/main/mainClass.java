package main;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dto.MemberVo;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "mybatis/config.xml";
		
		//mybatis(ibatis) 설정 파일을 read한다.
		try {
			InputStream is = Resources.getResourceAsStream(res);
			
			//SqlSessionFactory 객체를 취득
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			
			//SqlSession 객체를 취득
			SqlSession session = factory.openSession();
			
/*			//insert
			MemberVo vo = new MemberVo("batis3", "1111", "b@naver.com", "123", null);
			
			int n = session.insert("add", vo);
			if(n > 0) {
				session.commit();
				System.out.println("추가성공");
			}else {
				session.rollback();
				System.out.println("추가실패");
			}*/

			
			//delete
/*			int n = session.delete("remove","batis1");
			if(n > 0) {
				session.commit();
				System.out.println("삭제 성공");
			}else {
				session.rollback();
				System.out.println("삭제 실패");*/
			
			
			//select
/*			String findID = "batis3";
			MemberVo vo1 = session.selectOne("find", findID);
			if(vo1 == null) {
				System.out.println("검색된 회원이 없습니다.");
			}else {
				System.out.println(vo1.toString());
			}*/
			

			
			
			/*List<MemberVo> list = session.selectList("getlist");
			for(MemberVo vo : list) {
				System.out.println(vo.toString());
			}*/
			
			/* "id" db id값 */
			HashMap<String, Object> map = session.selectOne("getInfo", "batis3");

			String id = (String)map.get("ID");
			String pwd = (String)map.get("PWD");
			String email = (String)map.get("EMAIL");
			String phone = (String)map.get("PHONE");
			Timestamp regdate = (Timestamp)map.get("REGDATE");
			
			System.out.println("id:"+id+"pwd:"+pwd+"email:"+email+"phone:"+phone+"regdate:"+regdate);
			
			
			session.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

		
	}

}
