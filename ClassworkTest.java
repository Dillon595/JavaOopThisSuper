import com.newer.*;

/**  
 * @ClassName: TestClasswork
 * @Description: 
 * @author LYL
 * @date 2020-12-25 04:22:01 
*/

public class ClassworkTest {
	public static void main(String[] args) {
		System.out.println("******************第一题**********************");
		Product pro = new Product();
		pro.ToString();
		
		System.out.println();
		System.out.println("******************第二题**********************");
		User u1 = new User("qwewqewqeqw","12345678912","湖南长沙","123456789123456789");
		User u2 = new User("qwewqe213eqw","12345678912","湖南长沙","123456789123456789");
		
		System.out.println();
		System.out.println("******************第三题**********************");
		Student stuArr[] = new Student[4];
		stuArr[0] = new Student("雷杨龙","No01",100);
		stuArr[1] = new Student("周述蔚","No02",100);
		stuArr[2] = new Student("姜凯夫","No03",100);
		stuArr[3] = new Student("赵粹奇","No04",100);
		for(int i=0;i<4;i++) {
			stuArr[i].ToString();
		}
		
		System.out.println();
		System.out.println("******************第四题**********************");
		Student stu1 = new Student("雷杨龙","No05",200);
		stu1.avg();
	}
}
