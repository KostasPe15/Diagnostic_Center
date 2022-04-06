
public abstract class Test implements Comparable<Test> {
	protected String epon;
	protected String timestamp;
	
	public Test(String epon, String timestamp) {
		super();
		this.epon = epon;
		this.timestamp = timestamp;
	}

	public String getEpon() {
		return epon;
	}

	public void setEpon(String epon) {
		this.epon = epon;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public abstract boolean getApotel();
	
	public abstract String getType();
	
	public abstract String getExtra();
	
	public int compareTo(Test arg0) {
		return this.epon.compareTo(arg0.getEpon());
	}
	
}
