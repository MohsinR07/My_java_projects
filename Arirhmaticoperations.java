public class Arirhmaticoperations {
	void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	void sub(int a, int b) {
		int c = a-b;
		System.out.println(c);
	}
	void mul(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	void div(int a, int b) {
		int c = a/b;
		System.out.println(c);
	}
	void areaofsquare(int a) {
		int c = a*a;
		System.out.println(c);
	}
	void areaofcircle(int a) {
		double c = Math.PI*a*a;
		System.out.println(c);
	}
	void areaofreactangle(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	void areaofcylinder(int a, int b) {
		double c = 2*Math.PI*a*(a+b);
		System.out.println(c);
	}
	void areaofcube(int a) {
		int c = 6*(a*a);
		System.out.println(c);
	}
	void mod(int a, int b) {
		int c = a%b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Arirhmaticoperations ar = new Arirhmaticoperations();
		ar.add(3, 5);
		ar.sub(45, 12);
		ar.mul(3, 2);
		ar.div(10, 2);
		ar.areaofsquare(4);
		ar.areaofcircle(5);
		ar.areaofreactangle(5, 2);
		ar.areaofcylinder(6, 8);
		ar.areaofcube(6);
		ar.mod(8, 3);
	}

}
