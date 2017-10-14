package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc {
	public static void main(String[] args) throws SQLException {
		/**
		 * 1:��������
		 */
		//���������Ѿ����뵽����Ŀ
		//����������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 2:ƴ�����ݿ� �����ַ���
		 * ip username userpwd port dbName
		 * localhost root zhaolong 3306 mysqlDB
		 */
		//ƴ���ַ���
		String mysqlStr = "jdbc:mysql://localhost:3306/mysqlDB";
		//ͨ��mysql�ַ������û���,���롣�������Ӹ����ݿ��Connection����
		Connection con = DriverManager.getConnection(mysqlStr, "root", "zhaolong");
		/**
		 * 3:ִ��sql
		 */
		//׼��sql
		String sql = "select * from users";
		//����ִ�ж���
		Statement st = con.createStatement();
		//ִ����Query�󷵻�ResultSet
		ResultSet rs = st.executeQuery(sql);
		/**
		 * 4:��������
		 */
		while(rs.next()){
			System.out.print(rs.getObject(1));
			System.out.print(rs.getObject(2));
			System.out.print(rs.getObject(3));
			System.out.print(rs.getObject(4));
			System.out.print(rs.getObject(5));
			System.out.println(rs.getObject(6));
		}
		/**
		 * 5:�ر���Դ
		 */
		rs.close();//�൱�ڹ���,ȥ��ȡResultSet�е�����
		st.close();//�൱�ڷ��ſ���,ȥ���ݿ��ʲô
		con.close();//�൱����������������
	}
}
