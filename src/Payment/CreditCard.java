package Payment;

import ClassDiagram.BillingInformation;
import ClassDiagram.PaymentStrategy;

public class CreditCard implements BillingInformation {
	private String cardno;
	private String cvc;
	
	public CreditCard(String cardno, String cvc){
		this.cardno = cardno;
		this.cvc = cvc;
	}

	@Override
	public boolean validate() {
		return cardno.length() == 16 && cvc.length() == 3;
	}

	@Override
	public PaymentStrategy getPaymentStrategy() {
		// TODO Auto-generated method stub
		return new CcPaymentStrategy();
	}

}
