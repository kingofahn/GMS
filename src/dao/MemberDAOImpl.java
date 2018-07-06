package dao;

import java.util.List;

import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl instance = new MemberDAOImpl();
	public static MemberDAOImpl getInstance() {return instance;}
	private MemberDAOImpl() {}
	
	
	@Override
	public void createMember(MemberBean member) {
		System.out.println(member);
		System.out.println("DAO OK!!");
	}

	@Override
	public List<MemberBean> memberList() {
		// TODO Auto-generated method stub
		return null;
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
