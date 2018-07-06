package dao;

import java.util.List;

import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAO instance = new MemberDAOImpl();
	public static MemberDAO getInstance() {return instance;}
	private MemberDAOImpl() {}
	@Override
	public void insertMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<MemberBean> selectAllmemberList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MemberBean> selectMemberByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int memberCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public MemberBean selectFindById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
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
