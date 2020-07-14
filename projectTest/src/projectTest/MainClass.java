package projectTest;

public class MainClass {

	public static void main(String[] args) {
		// ���α׷��� ���۵� �� ���� ���� main ���� ���۵ȴ�.
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
