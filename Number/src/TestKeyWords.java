
public class TestKeyWords {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean flag;
	char c;

	public static void main(String[] args) {
		TestKeyWords obj =new TestKeyWords();
		System.out.println("b::"+obj.b);
		System.out.println("s::"+obj.s);
		System.out.println("i::"+obj.i);
		System.out.println("l::"+obj.l);
		System.out.println("f::"+obj.f);
		System.out.println("d::"+obj.d);
		System.out.println("flag::"+obj.flag);
		System.out.println("c::"+obj.c);
		//A a1=new A();
		//A a2=new A();
		 //a1.m1();
		 //a2.m1();
		

	}

}
class A{
	void m1() {
		System.out.println("A class m1 metheod");
	
	
}
}
