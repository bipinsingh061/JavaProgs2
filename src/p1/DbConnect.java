package p1;
import java.sql.*;
import java.util.Scanner;
public class DbConnect {
	public static void main(String[] args) throws SQLException {
		Connection con=null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","Pass@123");
			//Statement stmtStatement=con.createStatement();
			//stmtStatement.execute("INSERT INTO EMPLOYEE VALUES(7,'GALU',7,7,'GER');");
//			PreparedStatement pstmt=con.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?);");
			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter ID");
//			int id=sc.nextInt();
//			
//			System.out.println("Enter Name");
//			String name=sc.next();
//			
//			System.out.println("Enter age");
//			int age=sc.nextInt();
//			
//			System.out.println("Enter Salary");
//			int salary=sc.nextInt();
//			
//			System.out.println("Enter desig");
//			String desig=sc.next();
//			
//			pstmt.setInt(1, id);
//			pstmt.setString(2, name);
//			pstmt.setInt(3, age);
//			pstmt.setInt(4, salary);
//			pstmt.setString(5, desig);
//			pstmt.execute();
//			
//			System.out.println("Data Inserted");
			
			// delete record
			
//			PreparedStatement pstmtd=con.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=? ;");
//			System.out.println("Enter ID to be deleted");
//			id=sc.nextInt();
//			pstmtd.setInt(1,id);
//			pstmtd.execute();
//			System.out.println("ID "+id+" has been deleted");
			
			// update record , UPDATE NAME BASED ON ID
			
//			PreparedStatement pstmtu=con.prepareStatement("UPDATE EMPLOYEE SET NAME=? WHERE ID=?;");
//			System.out.println("Enter ID to be UPDATED");
//			int id=sc.nextInt();
//			System.out.println("Enter New Name");
//			String name=sc.next();
//			
//			pstmtu.setString(1,name);
//			pstmtu.setInt(2,id);
//			pstmtu.execute();
//			System.out.println("updated successfully");
			
			// read from database 
			
			Statement stmt=con.createStatement();
			System.out.println("Enter Desig ");
			String desig=sc.next();
			ResultSet rs=stmt.executeQuery("SELECT * FROM  EMPLOYEE WHERE DESIG="+"\'"+desig+"\'");
	
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt("AGE")+":"+rs.getInt(4)+":"+rs.getString("DESIG"));
			}

		} catch (Exception e) {
			System.out.println(e);
			
		}
		finally {
			con.close();

		}
	}
}
// primary key,check,default,unique