package projectTest;

public class FirstChildClass extends ParentClass{

	public FirstChildClass() {
		System.out.println("ChildClass constructor");
	}
	
	public void childFunc() {
		System.out.println("childFunc()");
	}
	
	@Override
	public void letsOverride() {
		System.out.println("this first child overrided func");
	}
}
