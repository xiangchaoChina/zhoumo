package com.util;
/**
 * ����properties
 * ���������ļ�
 * ��PropertyUtil��һ������ģʽ
 * ����ģʽ
 */
public class PropertyUtil2 {
	
	//����
	static PropertyUtil2 pu = new PropertyUtil2();
	
	//˽�еĹ��캯��
	private PropertyUtil2(){
		
	}
	//��ȡʵ��
	public static PropertyUtil2 newInstance(){	
		return pu;
	}
}
