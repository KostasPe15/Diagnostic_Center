
public class AntigenTest extends DiagnosticTest {
	private int time;

	public AntigenTest(String epon, String timestamp, boolean result, String deigma, int time) {
		super(epon, timestamp, result, deigma);
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public String getExtra() {
		return "Time: "+this.time;
	}
}
