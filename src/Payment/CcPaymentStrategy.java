package Payment;

import ClassDiagram.Bill;
import ClassDiagram.PaymentStrategy;

public class CcPaymentStrategy implements PaymentStrategy {

	@Override
	public boolean pay(Bill bill) {
		//TODO: change payment status of bill (or booking?) in database
		//request bank payment BANK_GIVE_MONEY(bill.getCost())
		return true;
	}

}
