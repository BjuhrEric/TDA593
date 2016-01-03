package Payment;

import java.util.UUID;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ClassDiagram.BillingInformation;
import ClassDiagram.Customer;
import ClassDiagram.PaymentStrategy;

public class Invoice extends MinimalEObjectImpl.Container implements BillingInformation {
	
	private UUID invoiceNbr;
	private Customer customer;
	
	
	public Invoice(Customer customer){
		this.customer = customer;
		invoiceNbr = UUID.randomUUID();
	}

	@Override
	public boolean validate() {
		return true;
	}
	public boolean send(){
		return true;
	}

	@Override
	public PaymentStrategy getPaymentStrategy() {
		return new InvoicePaymentStrategy();
	}

}
