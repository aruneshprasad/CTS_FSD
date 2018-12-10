package com;

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

class D extends C{
	
}

class E extends D{
	
}

public class F extends E{
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		A a5 = new E();
		A a6 = new F();
		
		D d = (D) a3;
		
		
		
		
		System.out.println("----------Done");
	}
}


