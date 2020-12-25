
package com.newer;

/**  
 * @ClassName: Student
 * @Description: 
 * @author LYL
 * @date 2020-12-25 04:33:05 
*/

public class Student {
	String name;
	String id;
	int grade;
	static int number;
	static int total;
	public Student(String name,String id,int grade){
		this.name=name;
		this.id=id;
		this.grade=grade;
		System.out.println("这是第"+(++number)+"个被创建的学生对象");
		total +=grade;
	}
	
	public void ToString() {
		System.out.println("name="+name+",id="+id+",grade="+grade);
	}
	
	public static void avg() {
		System.out.println("当前学生总成绩为："+total+"，当前学生平均成绩为："+total/number);
	}
}
