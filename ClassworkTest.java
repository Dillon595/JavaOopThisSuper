import com.newer.*;

/**  
 * @ClassName: TestClasswork
 * @Description: 
 * @author LYL
 * @date 2020-12-25 04:22:01 
*/

public class ClassworkTest {
	public static void main(String[] args) {
		System.out.println("******************��һ��**********************");
		Product pro = new Product();
		pro.ToString();
		
		System.out.println();
		System.out.println("******************�ڶ���**********************");
		User u1 = new User("qwewqewqeqw","12345678912","���ϳ�ɳ","123456789123456789");
		User u2 = new User("qwewqe213eqw","12345678912","���ϳ�ɳ","123456789123456789");
		
		System.out.println();
		System.out.println("******************������**********************");
		Student stuArr[] = new Student[4];
		stuArr[0] = new Student("������","No01",100);
		stuArr[1] = new Student("����ε","No02",100);
		stuArr[2] = new Student("������","No03",100);
		stuArr[3] = new Student("�Դ���","No04",100);
		for(int i=0;i<4;i++) {
			stuArr[i].ToString();
		}
		
		System.out.println();
		System.out.println("******************������**********************");
		Student stu1 = new Student("������","No05",200);
		stu1.avg();
	}
}
