
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
		System.out.println("���ǵ�"+(++number)+"����������ѧ������");
		total +=grade;
	}
	
	public void ToString() {
		System.out.println("name="+name+",id="+id+",grade="+grade);
	}
	
	public static void avg() {
		System.out.println("��ǰѧ���ܳɼ�Ϊ��"+total+"����ǰѧ��ƽ���ɼ�Ϊ��"+total/number);
	}
}
