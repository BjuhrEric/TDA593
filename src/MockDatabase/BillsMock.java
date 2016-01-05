package MockDatabase;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import ClassDiagram.Bill;
import DatabaseInterfaces.Bills;

public class BillsMock implements Bills{
	

	@Override
	public boolean saveBill(Bill bill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeBill(Bill bill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getBill(UUID billId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Bill> getBill(int roomNo, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
