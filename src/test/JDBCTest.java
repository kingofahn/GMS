package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
	public static void main(String[] args) {
		try {
			// try catch로 인해 이 아래는 무조건 실행된다.
			// Member m = new Member();   생성자에 의한 객체 생성
			// Member m = Member.getInstance();  싱글톤에 의한 객체생성 
			// 메모리에 있는 인스턴스가 하드에 다녀와야 되기 때문에 DriverManager(하드관리)에 접근한다.
			// 시스템이 다운되지 않도록 내부적으로 처리한다. 커넥션은 이 안에서만 움직인다.
			Class.forName("oracle.jdbc.driver.OracleDriver");  // 클래스가 나를 부르는 방식  / 객체가 나를 보는 느낌임 /리턴이 없음
			Connection conn = DriverManager.
					getConnection("jdbc:oracle:thin:@localhost:1521:xe",
							"user1",
							"user1");
			Statement stmt = conn.createStatement();   //  오라클 의  영역이라서 Statement를 하나의 오라클 문서로 본다. 
			ResultSet rs = stmt.executeQuery("SELECT * FROM TAB");
			List<String> list = new ArrayList<>();
			while(rs.next()) {
				list.add(rs.getString("TNAME"));
			}
			System.out.println("테이블 " + list);

			String count ="";
			while(rs.next()) {
				count = rs.getString("count");	
			}
			
		} catch (SQLException e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
