
public class MolecularTest extends DiagnosticTest {
	private double akribeia;

	public MolecularTest(String epon, String timestamp, boolean result, String deigma, double akribeia) {
		super(epon, timestamp, result, deigma);
		this.akribeia = akribeia;
	}

	public double getAkribeia() {
		return akribeia;
	}

	public void setAkribeia(double akribeia) {
		this.akribeia = akribeia;
	}
	
	public String getExtra() {
		return "Accuracy: "+this.akribeia;
	}
}
