package com.mysql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/**
		 * ��ȡ��׺��Ϊproperties���ļ�
		 */
		//����properties����
		Properties properties = new Properties();
		//ʹ��load�����ļ�(����)
		properties.load(new FileInputStream("resource/jdbc.properties"));
		//���
		System.out.println(properties.getProperty("jdbc.url"));
	}
}
