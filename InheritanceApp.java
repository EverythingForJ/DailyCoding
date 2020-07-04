class Cal{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    // Overloading �����ϴ�.ž���ϴ�.��Ӱ��� �������.
    // ���� �̸��� �޼ҵ带 �Ű������� �ٸ��������ν� �޼ҵ带 ������ �����.
    // �Ű������� �����Ǵ� ������Ÿ������ �ڽ��� �� �޼ҵ带 �����Ѵ�.
    // �����Ϸ��� ������ ������ ���� �̸��� ���� �޼ҵ带 �ٸ��̸��� �޼ҵ�� �������Ѵ�.
    // ����Ÿ���� ���������ʴ´�.
    public int sum(int v1, int v2, int v3){
        // this:�ڱ��ڽ��� sum�� ���
    	return this.sum(v1, v2)+v3;
    }
}
class Cal3 extends Cal{
    public int minus(int v1, int v2){
        return v1-v2;
    }
    // Overriding �θ� ���� �޼ҵ带 ��������. �θ�Ŭ�����޼ҵ带 �ö�Ÿ�� ������.
    // ��Ӱ� ���õǾ��ִ�.
    // ����Ŭ������ �޼ҵ带 ����Ŭ������ ������ �������ϴ°�.
    public int sum(int v1, int v2){
        System.out.println("Cal3!!");
        // super: �θ��� sum�� ����.
        return super.sum(v1,v2);
    }
 
}
public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));
 
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
    }
}
class Cal2{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    public int minus(int v1, int v2){
        return v1-v2;
    }
}