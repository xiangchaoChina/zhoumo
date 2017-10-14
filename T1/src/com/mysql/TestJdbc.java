package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc {
	public static void main(String[] args) throws SQLException {
		/**
		 * 1:驱动配置
		 */
		//将驱动包已经加入到了项目
		//加载驱动类
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 2:拼接数据库 连接字符串
		 * ip username userpwd port dbName
		 * localhost root zhaolong 3306 mysqlDB
		 */
		//拼接字符串
		String mysqlStr = "jdbc:mysql://localhost:3306/mysqlDB";
		//通过mysql字符串和用户名,密码。生成连接该数据库的Connection对象
		Connection con = DriverManager.getConnection(mysqlStr, "root", "zhaolong");
		/**
		 * 3:执行sql
		 */
		//准备sql
		String sql = "select * from users";
		//创建执行对象
		Statement st = con.createStatement();
		//执行完Query后返回ResultSet
		ResultSet rs = st.executeQuery(sql);
		/**
		 * 4:处理数据
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
		 * 5:关闭资源
		 */
		rs.close();//相当于工人,去获取ResultSet中的数据
		st.close();//相当于发号口令,去数据库干什么
		con.close();//相当于运输渠道。核心
	}
}
