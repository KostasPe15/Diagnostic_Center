
public class DiagnosticTest extends Test {
	private boolean result;
	private String deigma;
	
	public DiagnosticTest(String epon, String timestamp, boolean result, String deigma) {
		super(epon, timestamp);
		this.result = result;
		this.deigma = deigma;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}


	public void setDeigma(String deigma) {
		this.deigma = deigma;
	}

	@Override
	public boolean getApotel() {
		return this.result;
	}
	
	public String getType() {
		return this.deigma;
	}

	@Override
	public String getExtra() {
		// TODO Auto-generated method stub
		return "PAOK";
	}
	
}
