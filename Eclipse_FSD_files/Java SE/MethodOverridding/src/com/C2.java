package com;


class C1 {

	public void f1() {}
	
	void f2() {}
	
	protected void f3() {}
	private void f4() {}
	void f5() {}
}

public class C2 extends C1 {
	
	protected void f55() {}
	
	protected void f4() {}
	
	
	public void f5() {}
	
	@Override
	protected void f3() {}
	//public void f3() {}
	
	
	public void f1() {}

	@Override
	void f2() {}
	//public void f2() {}
	//protected void f2() {}
}
