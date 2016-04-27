package data.model;

import java.util.Date;

public class Invoice {
	private int iid;
	private int cid;
	private int amount;
	private Date dueDate;
	private boolean paid;
	
	public Invoice(int iid, int cid, int amount, Date dueDate, boolean paid) {
		super();
		this.iid = iid;
		this.cid = cid;
		this.amount = amount;
		this.dueDate = dueDate;
		this.paid = paid;
	}
	
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
}
