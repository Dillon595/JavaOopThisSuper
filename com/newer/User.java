package com.newer;

/**
 * @ClassName: User
 * @Description:
 * @author LYL
 * @date 2020-12-25 04:25:11
 */

public class User {
	String username;
	String phone;
	String address;
	String password;
	static int number=0;
	public User(String username, String phone, String address, String password) {
		this.username = username;
		this.phone = phone;
		this.address = address;
		this.password = password;
		System.out.println("��ǰ�ǵ�"+(++number)+"�δ�������");
	}
	
	static {
		if(number==0) {			
			System.out.println("��ʼ�������ļ�����������̬�飩");
		}
	}
}
