package MockDatabase;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import ClassDiagram.Bill;
import DatabaseInterfaces.Bills;

public class BillsMock implements Bills{
	
	private HashMap<UUID, Bill> bills;
	private static BillsMock instance = null;
	
	private BillsMock(){
		bills = new HashMap<UUID, Bill>();
	}

	public static BillsMock getInstance(){
		if(instance == null){
			instance = new BillsMock();
		}
		return instance;	
	}
	
	@Override
	public boolean saveBill(Bill bill) {
		Bill result = bills.put(new UUID(0, bill.getId()), bill);
		//Returns true if the key was not bound to a value or if the bill is already saved.
		//If there is a crash in UUID, the method returns false
		return result == null || result.equals(bill);
	}

	@Override
	public boolean removeBill(Bill bill) {
		Bill result = bills.remove(new UUID(0,bill.getId()));
		return result.equals(bill) || result == null;
	}

	@Override
	public Bill getBill(UUID billId) {
		return bills.get(billId.getLeastSignificantBits());
	}

	@Override
	public List<Bill> getBill(int roomNo, Date date) {
		//TODO: implement when roomMock is done
		return null;
	}

}
