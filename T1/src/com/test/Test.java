package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.util.PropertyUtil;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//����PropertyUtil����
		PropertyUtil p1 = PropertyUtil.newInstance();
		//����Properties�ļ�·��
		p1.load("resource/jdbc.properties");
		System.out.println(p1.getProperty("jdbc.url"));
	}
}
