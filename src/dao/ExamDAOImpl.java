package dao;

import java.util.ArrayList;
import java.util.List;

import domain.ExamBean;
import domain.MemberBean;

public class ExamDAOImpl implements ExamDAO {
	private static ExamDAOImpl instance = new ExamDAOImpl();
	public static ExamDAOImpl getInstance() {return instance;}
	private ExamDAOImpl() {}
	List<ExamBean> examList;
	
	
	@Override
	public void createExam(ExamBean exam) {
		System.out.println("ExamDAOImpl ok");

	}

	@Override
	public List<ExamBean> examlist() {
		return examList;
	}

	
	
	@Override
	public List<ExamBean> findExamById(String id) {
		List<ExamBean> temp =new ArrayList<>();
		for(ExamBean e: examList) {
			if(id.equals(e.getMemId())) {
				temp.add(e);
			}
		}
		return temp;
	}


	@Override
	public ExamBean findExamById(ExamBean exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateExamInformation(ExamBean exam) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteExamInformation(ExamBean exam) {
		// TODO Auto-generated method stub

	}

	@Override
	public int examCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
