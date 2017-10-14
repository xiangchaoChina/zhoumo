package com.util;
/**
 * 创建properties
 * 操作属性文件
 * 让PropertyUtil是一个单例模式
 * 饿汉模式
 */
public class PropertyUtil2 {
	
	//单例
	static PropertyUtil2 pu = new PropertyUtil2();
	
	//私有的构造函数
	private PropertyUtil2(){
		
	}
	//获取实例
	public static PropertyUtil2 newInstance(){	
		return pu;
	}
}
