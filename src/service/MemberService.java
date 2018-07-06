package service;
import java.util.List;
import domain.MemberBean;

public interface MemberService {
	public void createMember(MemberBean member);
	public List<MemberBean> memberList();
	public List<MemberBean> findMemberByName(String name);
	public int memberCount();
	public MemberBean findById(MemberBean member);
	public void updateMemberInformation(MemberBean member);
	public void deleteMemberInformation(MemberBean member);
}