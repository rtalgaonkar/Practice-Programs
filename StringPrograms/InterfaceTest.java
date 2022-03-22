package StringPrograms;

public class InterfaceTest implements Interface1, Interface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method3() {
		// TODO Auto-generated method stub
		return Interface1.super.method3();
	}

}

interface Interface1 {
	void method1();
	void method2();
	default int method3() {
		System.out.println("part of interface1");
		return 1;
	}
}

interface Interface2 {
	void method1();
	void method2();
	default int method3() {
		System.out.println("part of interface 2");
		return 2;
	}
}
