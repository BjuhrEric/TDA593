package Payment;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ClassDiagram.Bill;
import ClassDiagram.PaymentStrategy;

public class InvoicePaymentStrategy extends MinimalEObjectImpl.Container implements PaymentStrategy {

	@Override
	public boolean pay(Bill bill) {
		// TODO Auto-generated method stub
		return true;
	}

}
