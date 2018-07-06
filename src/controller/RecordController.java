package controller;

import javax.swing.JOptionPane;

import domain.*;
import service.ExamServiceImpl;
import service.MemberServiceImpl;


public class RecordController {
	private static RecordController instance = new RecordController();
	public static RecordController getIntance() {return instance;}
	private RecordController() {}
	
	public static void main(String[] args) {
		while (true) {
			switch (JOptionPane.showInputDialog("0.EXIT 1.Test")) {
			case "1":
				ExamBean exam = new ExamBean();
				exam.setMemId(JOptionPane.showInputDialog("이름 / 월  / JAVA  / SQL / HTML5 /  R  / PYTHON"));
				ExamServiceImpl.getInstance().createExam(exam);
				break;
				
			case "2":
				break;
			case "3":
				break;
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



