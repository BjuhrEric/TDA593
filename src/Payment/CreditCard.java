package Payment;

import ClassDiagram.BillingInformation;
import ClassDiagram.PaymentStrategy;

public class CreditCard implements BillingInformation {
	private String cardno;
	private String cvv;
	
	public CreditCard(String cardno, String cvv){
		this.cardno = cardno;
		this.cvv = cvv;
	}

	@Override
	public boolean validate() {
		return cardno.length() == 16 && cvv.length() == 3;
	}

	@Override
	public PaymentStrategy getPaymentStrategy() {
		// TODO Auto-generated method stub
		return new CcPaymentStrategy();
	}

}
