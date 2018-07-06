package service;

import java.util.List;

import dao.MemberDAOImpl;
import domain.MemberBean;


public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {return instance;}
	private MemberServiceImpl() {}
	List<MemberBean> memberList;
	
	
	@Override
	public void createMember(MemberBean member) {
		MemberDAOImpl.getInstance().createMember(member);
		System.out.println("MemberService OK");
	}

	@Override
	public List<MemberBean> memberList() {
		return memberList;
	}

	@Override
	public List<MemberBean> findMemberByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMemberInformation(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMemberInformation(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

}
