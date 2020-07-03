class Accounting {
	public double valueOfSupply;
	// �ΰ������� �ٲ����ʱ⿡ Ŭ���� �Ҽ����� �ϴ� ��
    public static double vatRate = 0.1;
    // ������
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp {
	    public static void main(String[] args) {
	    	Accounting A1 = new Accounting(10000.0);
	    	Accounting A2 = new Accounting(20000.0);
	    	System.out.println("Value of supply : " + A1.valueOfSupply);
	    	System.out.println("Value of supply : " + A2.valueOfSupply);
	        System.out.println("VAT : " + A1.getVAT());
	        System.out.println("VAT : " + A2.getVAT());
	        System.out.println("Total : " + A1.getTotal());
	        System.out.println("Total : " + A2.getTotal());
	    }
}