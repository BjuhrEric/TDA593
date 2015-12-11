package Payment;

import ClassDiagram.BillingInformation;
import ClassDiagram.PaymentStrategy;

public class Invoice implements BillingInformation {
	
	private long invoiceNbr;
	
	
	public Invoice(long invoiceNbr){
		this.invoiceNbr = invoiceNbr;
	}

	@Override
	public boolean validate() {
		return true;
	}

	@Override
	public PaymentStrategy getPaymentStrategy() {
		// TODO Auto-generated method stub
		return new InvoicePaymentStrategy();
	}

}
