package java_this_uses;


//to invoke the current class method


class A{
	void m () {
		System.out.println("iam method m");
	}
	
	
	void n() {
		System.out.println("iam method n");
		this.m(); 
//		or 
//		m(); both are same
	}
}

//clarifies the method call : makes it clear that the m() method being called is the one that belongs to the current object(an instance of class A)

public class Java_this_uses_Invoke_Current_Class_Method {
	public static void main(String[] args) {
		A a = new A();
		a.n();
	}

}


