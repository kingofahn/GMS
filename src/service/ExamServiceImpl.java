package service;

import java.util.ArrayList;
import java.util.List;

import dao.ExamDAOImpl;
import dao.MemberDAOImpl;
import domain.ExamBean;
import domain.MemberBean;

public class ExamServiceImpl implements ExamService {
	private static ExamServiceImpl instance = new ExamServiceImpl();
	public static ExamServiceImpl getInstance() {return instance;}
	private ExamServiceImpl() {}
	List<ExamBean> examList;
	
	
	@Override
	public void createExam(ExamBean exam) {
		ExamDAOImpl.getInstance().createExam(exam);
		System.out.println(exam.getMemId());
		System.out.println("ExamServiceImpl OK!!");

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
