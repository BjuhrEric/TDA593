package DatabaseInterfaces;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import ClassDiagram.Bill;

public interface Bills {

	boolean saveBill (Bill bill);
	boolean removeBill (Bill bill);
	Bill getBill (UUID billId);
	
	/**
	 * Returns a list of bills associated with the given room no.
	 * If a date is submitted, this list will only contain the bill associated
	 * with the room at that time.
	 */
	List<Bill> getBill(int roomNo, Date date);
}
