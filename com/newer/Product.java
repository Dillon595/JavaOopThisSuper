
package com.newer;

/**
 * @ClassName: Product
 * @Description: ��д��Ʒ�࣬�������� ���ƣ����ͣ��۸񣬲��ء� 1.Ϊ�����������getter ��
 *               setter��Ҫ��setter�����в�������������������ͬ��ʹ��this�ؼ���
 *               2.��д���캯������Ա���Ը�ֵ��ͬ����Ҫ����������������ͬ��ʹ��this�ؼ���
 *               3.��д�޲����Ĺ��캯����Ҫ���ڸù��캯���е���֮ǰд���в����Ĺ��캯����ʹ��this�ؼ��� 4.���toStirng����
 *               5.��������ʹ������������췽���������󣬲���ʾtoString�����Ľ��
 * @author LYL
 * @date 2020-12-25 04:14:50
 */

public class Product {
	String name;
	String type;
	int price;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Product() {
		this("�·�", "�ް�", 599, "���ϳ�ɳ");
	}

	public Product(String name, String type, int price, String address) {
		this.address = address;
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public void ToString() {
		System.out.println("name="+name+",type="+type+",price="+price+",address="+address);
	}

}
