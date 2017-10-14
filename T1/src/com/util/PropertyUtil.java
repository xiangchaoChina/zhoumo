package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * ����properties
 * ���������ļ�
 * ��PropertyUtil��һ������ģʽ
 * ����ģʽ
 */
public class PropertyUtil {
	
	//����
	static PropertyUtil pu = null;
	//��ȡ�ļ�
	private Properties pt = new Properties();
	
	//˽�еĹ��캯��
	private PropertyUtil(){
		
	}
	//��ȡʵ��
	public static PropertyUtil newInstance(){
		
		if(pu==null)
			pu = new PropertyUtil();
		
		return pu;
	}
	
	//�����ļ�·��
	public void load(String path) throws FileNotFoundException, IOException{
		pt.load(new FileInputStream(path));
	}
	
	//����key��ȡvalue
	public String getProperty(String key){
		return pt.getProperty(key);
	}
}
