
package com.newer;

/**
 * @ClassName: Product
 * @Description: 编写商品类，包含属性 名称，类型，价格，产地。 1.为所有属性添加getter 与
 *               setter，要求setter方法中参数名必须与属性名相同，使用this关键字
 *               2.编写构造函数给成员属性赋值，同样需要参数名与属性名相同，使用this关键字
 *               3.编写无参数的构造函数，要求在该构造函数中调用之前写的有参数的构造函数，使用this关键字 4.添加toStirng方法
 *               5.测试类中使用上述多个构造方法创建对象，并显示toString（）的结果
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
		this("衣服", "棉袄", 599, "湖南长沙");
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
