# JavaOopThisSuper
this和super
×××打包要求： 以下作业中所有类都写在com.newer包中，测试类直接写在src下×××


 一。 编写商品类，包含属性 名称，类型，价格，产地。
      1.为所有属性添加getter 与  setter，要求setter方法中参数名必须与属性名相同，使用this关键字
      2.编写构造函数给成员属性赋值，同样需要参数名与属性名相同，使用this关键字
      3.编写无参数的构造函数，要求在该构造函数中调用之前写的有参数的构造函数，使用this关键字
      4.添加toStirng方法
      5.测试类中使用上述多个构造方法创建对象，并显示toString（）的结果	

 二。 编写用户类，包含属性 用户名，手机号码，家庭住址，密码
      1.编写构造函数给成员属性赋值，同样需要参数名与属性名相同，使用this关键字	
      2.结合static关键字改写之前的构造函数，实现在每次创建新对象时能显示是第几个被创建的对象（添加一个静态的整形属性，每次在构造函数中对其加一并显示当前值）
      3.结合static关键字实现，仅在第一次创建对象时显示：开始加载类文件。。。（静态块）
      4.在测试类中测试上述要求
	
 三。 编写学生类，包含姓名，学号（字符串：“No01”），成绩三个属性
    1.为学生类添加构造函数给每个成员属性赋值，使用this关键字
    2.为学生添加toString（）方法显示所有属性
    3.在测试类中定义学生数组，长度为4。分别给数组每个元素赋值，然后循环调用每个元素toString方法显示数据
    4.集合static关键字实现：在每次创建对象时都能显示这是第几个被创建的学生对象


四。（挑战题）在上题的学生类中添加静态属性：total表示总成绩，要求实现在每次创建学生对象时将该学生成绩累加到总成绩上。
     在学生类中添加静态方法：avg（） 要求该方法能在控制台输出当前所有学生的总成绩与平均成绩。
    
