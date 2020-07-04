class Cal5{
	int v1,v2;
	Cal5(int v1, int v2){
		System.out.println("Cal5 init!!");
		this.v1=v1;
		this.v2=v2;
	}
	public int sum() {
		return this.v1+v2;
	}
}
class Cal6 extends Cal5{
	Cal6(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal6 init!!");
	}
	public int minus() {
		return this.v1-v2;
	}
}
public class InheritanceApp2 {
    public static void main(String[] args) {
        Cal5 c5 = new Cal5(2,1);
        Cal6 c6 = new Cal6(2,1);
        System.out.println(c6.sum());
        System.out.println(c6.minus());
    }
}