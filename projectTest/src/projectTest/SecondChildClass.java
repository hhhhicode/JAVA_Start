package projectTest;

public class SecondChildClass extends ParentClass{

	public SecondChildClass() {
		System.out.println("ChildClass constructor");
	}
	
	public void childFunc() {
		System.out.println("childFunc()");
	}
	
	@Override
	public void letsOverride() {
		System.out.println("this second child overrided func");
	}
}
