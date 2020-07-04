class Cal{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    // Overloading 과적하다.탑재하다.상속과는 상관없다.
    // 같은 이름의 메소드를 매개변수를 다르게함으로써 메소드를 여러개 만든다.
    // 매개변수의 개수또는 데이터타입으로 자신이 들어갈 메소드를 구분한다.
    // 컴파일러가 컴파일 시점에 같은 이름을 가진 메소드를 다른이름의 메소드로 컴파일한다.
    // 리턴타입은 구별하지않는다.
    public int sum(int v1, int v2, int v3){
        // this:자기자신의 sum을 사용
    	return this.sum(v1, v2)+v3;
    }
}
class Cal3 extends Cal{
    public int minus(int v1, int v2){
        return v1-v2;
    }
    // Overriding 부모가 가진 메소드를 변경했음. 부모클래스메소드를 올라타서 재정의.
    // 상속과 관련되어있다.
    // 상위클래스의 메소드를 하위클래서에 가져와 재정의하는것.
    public int sum(int v1, int v2){
        System.out.println("Cal3!!");
        // super: 부모의 sum을 썼음.
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