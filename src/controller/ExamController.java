package controller;

import java.util.List;

import javax.swing.JOptionPane;

import domain.*;
import service.ExamServiceImpl;
import service.MemberServiceImpl;


public class ExamController {

	
	public static void main(String[] args) {
		ExamBean exam = null;
		MemberBean mem = null;
		while (true) {
			switch (JOptionPane.showInputDialog("0.EXIT 1.이름.월  2.성적")) {
			case "1":
				exam = new ExamBean();
				mem = new MemberBean();
				String[] arr = (JOptionPane.showInputDialog("이름 / 월 ").split("/"));
				exam.setMonth("7");
				exam.setMemId("저스티스4");
//				List<MemberBean> list = MemberServiceImpl.getInstance().findMemberByName(arr[0]);
//				if(list.size()==0) {
//					System.out.println("해당 이름의 학생이 없어요");
//				} else if (list.size()==1) {
//					exam.setMemId(list.get(0).getMemId());
//				} else {
//					System.out.println(list);
//				} 
				ExamServiceImpl.getInstance().createExam(exam);
				break;
			case "2":
				exam.setScore(JOptionPane.showInputDialog("JAVA  / SQL / HTML5 /  R  / PYTHON"));
				ExamServiceImpl.getInstance().createExam(exam);
				break;
			case "3":
			case "4":
				break;
			case "5":
				MemberServiceImpl.getInstance().memberList();
				break;
			default : return;
			}
		}
	}
}