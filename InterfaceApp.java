// 클래스는 하나만 상속가능하지만 인터페이스는 여러개 가능
interface calculable{
	double PI =3.14;
	int sum(int v1, int v2);
}
interface Printable {
	void print();
}
class Realcal implements calculable, Printable {
	@Override
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	@Override
	public void print() {
		System.out.println("this is Realcal!!");
	}
}
public class InterfaceApp {
	public static void main(String[] args) {
		Realcal c = new Realcal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}
}