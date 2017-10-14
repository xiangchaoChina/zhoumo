package com.mysql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/**
		 * 读取后缀名为properties的文件
		 */
		//创建properties对象
		Properties properties = new Properties();
		//使用load关联文件(加载)
		properties.load(new FileInputStream("resource/jdbc.properties"));
		//输出
		System.out.println(properties.getProperty("jdbc.url"));
	}
}
