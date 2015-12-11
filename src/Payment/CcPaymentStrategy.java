package Payment;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ClassDiagram.Bill;
import ClassDiagram.PaymentStrategy;

public class CcPaymentStrategy extends MinimalEObjectImpl.Container implements PaymentStrategy {
 
	@Override
	public boolean pay(Bill bill) {
		//TODO: change payment status of bill (or booking?) in database
		//request bank payment BANK_GIVE_MONEY(bill.getCost())
		return true;
	}

}
