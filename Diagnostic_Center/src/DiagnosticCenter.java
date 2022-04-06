import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DiagnosticCenter {
	private ArrayList<Test> tests;

	public DiagnosticCenter() {
		tests = new ArrayList<Test>();
	}
	
	public void addTest(Test aTest) {
		tests.add(aTest);
	}
	
	public void statistics() {
		int positive = 0;
		int negative = 0;
		for(Test t : tests) {
			if(t.getApotel())
				positive++;
			else
				negative++;
		}
		double posit = (positive/tests.size());
		double neg = (negative/tests.size());
		System.out.println("Positive Tests: "+positive+"("+posit+"%)"+", Negative Tests: "+negative+"("+neg+"%)");
	}
	
	public void checkForTest(ArrayList<String> names) {
		Collections.sort(tests);
		
		try
		{
			File f = new File("TestedPeople.txt");
			FileWriter writer = new FileWriter(f);
			
			for(Test t : this.tests) {
				if(names.contains(t.getEpon())) {
					writer.write(t.getEpon()+" has performed a test with the following information:");
					writer.write(System.lineSeparator());
					writer.write(t.getClass().getName()+", date: "+t.getTimestamp()+" Result: "+t.getApotel()+ ", Type: "+t.getType()+", "+t.getExtra());
					writer.write(System.lineSeparator());
					writer.write("---------------");
					writer.write(System.lineSeparator());
				}else {
					writer.write(t.getEpon()+" has not performed any test.");
					writer.write(System.lineSeparator());
					writer.write("---------------");
					writer.write(System.lineSeparator());
				}
			}
			
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
