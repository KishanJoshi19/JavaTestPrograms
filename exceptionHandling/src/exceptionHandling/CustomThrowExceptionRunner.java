package exceptionHandling;

class Amounts {
	private String currency;
	private int amount;

	public Amounts(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amounts other) throws CurrencyDoNotMatch {

		if (!this.currency.equals(other.currency)) {
			// throw new RuntimeException("Currency don't match " + this.currency + " & " +
			// other.currency);

			throw new CurrencyDoNotMatch("Currency don't match " + this.currency + " & " + other.currency);
		}

		this.amount = this.amount + other.amount;
	}

	private Exception CurrencyDoNotMatch(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrencyDoNotMatch extends Exception {
	public CurrencyDoNotMatch(String msg) {
		super(msg);
	}

}

public class CustomThrowExceptionRunner {

	public static void main(String[] args) throws CurrencyDoNotMatch {

		Amounts amount1 = new Amounts("USD", 10);
		Amounts amount2 = new Amounts("INR", 20);

		amount1.add(amount2);

		System.out.println(amount1);

	}

}
