package mybatis.services.item.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.service.spring.domain.Item;

import mybatis.services.item.Impl.itemDAOImpl;

/*
 * FileName : MyBatisTestApp102.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping10.xml
  * ㅇ MyBatisUserDAOImpl10
  * ㅇ TestUtil.java 을 이용 Test . 
  * ㅇ Persistance Logic Layer 단위 Test..여기서 에러난다고해도 mybatis-userservice-mapping10.xml는 볼 필요없다.
  *   ::Persistence Layer의 단위테스트 마무리
  *  
  *  ㅇ 다음은 Service Layer 단위 테스트 : MyBatisTestApp11.java
  */
public class MyBatisUnitTest {
	///Main method
	public static void main(String[] args) throws Exception{

		SqlSession session = null;
		//==> TestUtil 의 getSqlSessionFactory()을 이용 SqlSessionFactory instance GET
		SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
		session=factory.openSession();
		
			
		//==> itemDAOImpl 생성 및 sqlMapClient 객체 setter injection
		itemDAOImpl dao = new itemDAOImpl();
		dao.setSqlSession(session);
		Item item=new Item();
		List<Item> list=dao.getItemList(item);
		TestUtil.printList(list);
		
		item.setName("딸기");
		System.out.println(dao.getItem(item.getName()));
		
		
	}//end of main
}//end of class