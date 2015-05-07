package guestbookDao;

import guestbookVo.GuestBookVo;
import guestbookDao.GuestBookDao;
import java.util.List;

public class TestGuestBookDao {

	public static void main(String[] args) {
		try {
			// 0. delete 테스트
			 testDelete();
			// 1. insert 테스트
			//testInsert();
			// 2. fetchList 테스트
			//testFetchList();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	
	  public static void testDelete() throws Exception{ 
		  
		   GuestBookVo vo = new GuestBookVo();
		   
		   vo.setNo(3l);
		   vo.setPwd("1234");
		   
		   GuestBookDao dao = new GuestBookDao();
		   dao.delete(vo);
	  }
	 
	 

	public static void testFetchList() throws Exception {
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.fetchList();

		for (GuestBookVo vo : list) {
			System.out.println(vo.getNo() + " : ");
			System.out.println(vo.getName() + " ");
			System.out.println(vo.getMsg() + " : ");
			System.out.println(vo.getDate());
			System.out.println("\n");
		}
	}

	public static void testInsert() throws Exception {
		GuestBookVo vo = new GuestBookVo();

		vo.setName("SA2");
		vo.setPwd("1234");
		vo.setMsg("테스트임돠~~~");
		
		GuestBookDao dao = new GuestBookDao();
		dao.insert(vo);

	}

}
