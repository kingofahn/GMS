package dao;
import java.util.List;
import domain.MemberBean;

public interface MemberDAO {
	public void insertMember(MemberBean member);
	public List<MemberBean> selectAllmemberList();
	public List<MemberBean> selectMemberByName(String name);
	public MemberBean selectFindById(MemberBean member);
	public int memberCount();
	public void updateMemberInformation(MemberBean member);
	public void deleteMemberInformation(MemberBean member);
}