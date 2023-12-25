package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.player.Player;

public class ConnectDB {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classwork","root","amol123");
			String que="select * from player";
			
			Statement stat=con.createStatement();
			
			ResultSet rs=stat.executeQuery(que);
//			rs.next();
			System.out.print("Enter jno : ");
			int a=sc.nextInt();
			Player p=new Player();
			while(rs.next())
			{
				if(a==rs.getInt("jno")) 
				{
					p.setName(rs.getString("Name"));
					p.setJno(rs.getInt("jno"));
					p.setAge(rs.getInt("age"));
				}
	
			}	
			System.out.println(p);
			sc.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
