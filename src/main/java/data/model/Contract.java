package data.model;

public class Contract {
	private int cid;
	private String type;
	private int rate;
	private boolean exp;
	
	public Contract(int cid, String type, int rate, boolean exp) {
		super();
		this.cid = cid;
		this.type = type;
		this.rate = rate;
		this.exp = exp;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public boolean getExp() {
		return exp;
	}
	public void setExp(boolean exp) {
		this.exp = exp;
	}
	
}
