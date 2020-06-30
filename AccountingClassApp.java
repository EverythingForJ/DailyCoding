class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	

	public static void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ getVAT() );
		System.out.println("Total : "+ getTotal() );
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );
		System.out.println("Dividend 1 : "+ getDividend1() );
		System.out.println("Dividend 2 : "+ getDividend2() );
		System.out.println("Dividend 3 : "+ getDividend3() );
	}

	public static double getDividend1() {
		double dividend1 = getIncome() * 0.5;
		return dividend1;
	}

	public static double getDividend2() {
		double dividend1 = getIncome() * 0.3;
		return dividend1;
	}

	public static double getDividend3() {
		double dividend1 = getIncome() * 0.2;
		return dividend1;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		double expense = valueOfSupply*expenseRate;
		return expense;
	}

	public static double getTotal() {
		double total = valueOfSupply + getVAT();
		return total;
	}

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

}


public class AccountingClassApp {
	
	
	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		
	}

}
