package DatabaseInterfaces;

import java.rmi.server.UID;
import java.util.Date;
import java.util.List;

import ClassDiagram.Bill;

public interface Bills {

	boolean saveBill (Bill bill);
	boolean removeBill (Bill bill);
	boolean getBill (UID billId);
	
	/**
	 * Returns a list of bills associated with the given room no.
	 * If a date is submitted, this list will only contain the bill associated
	 * with the room at that time.
	 */
	List<Bill> getBill(int roomNo, Date date);
	
}
