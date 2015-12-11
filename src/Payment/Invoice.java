package Payment;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ClassDiagram.BillingInformation;
import ClassDiagram.PaymentStrategy;

public class Invoice extends MinimalEObjectImpl.Container implements BillingInformation {
	
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
