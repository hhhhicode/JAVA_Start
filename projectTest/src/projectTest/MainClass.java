package projectTest;

public class MainClass {

	public static void main(String[] args) {
		// 프로그램이 시작될 때 가장 먼저 main 부터 시작된다.
		System.out.println("Hello Java World!!!");
		
		ParentClass parent = new ParentClass();
		FirstChildClass child = new FirstChildClass();
		child.childFunc();
		child.parentFunc();
		
		parent.letsOverride();
		child.letsOverride();
		
		System.out.println("[----------------------]");
		ParentClass[] pArr = new ParentClass[2];
		pArr[0] = new FirstChildClass();
		pArr[1] = new SecondChildClass();
		
		for(ParentClass p : pArr) {
			p.letsOverride();
		}
	}
}
