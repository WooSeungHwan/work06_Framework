package spring.service.dao.impl;

import spring.service.dao.MemberDAO;

public class MemberDAOImpl implements MemberDAO{
	
	public MemberDAOImpl() {
	    System.out.println("MemberDAOImpl 생성자 호출됨");
	}


	@Override
	public void register(String id, String name) {
		System.out.println(name + " 님 등록성공~~!!");
		
	}

	@Override
	public void delete(String id) {
		System.out.println(id + " 님 등록성공~~!!");

		
	}

}
