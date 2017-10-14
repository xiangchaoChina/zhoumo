package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 创建properties
 * 操作属性文件
 * 让PropertyUtil是一个单例模式
 * 懒汉模式
 */
public class PropertyUtil {
	
	//单例
	static PropertyUtil pu = null;
	//读取文件
	private Properties pt = new Properties();
	
	//私有的构造函数
	private PropertyUtil(){
		
	}
	//获取实例
	public static PropertyUtil newInstance(){
		
		if(pu==null)
			pu = new PropertyUtil();
		
		return pu;
	}
	
	//传递文件路径
	public void load(String path) throws FileNotFoundException, IOException{
		pt.load(new FileInputStream(path));
	}
	
	//根据key获取value
	public String getProperty(String key){
		return pt.getProperty(key);
	}
}
