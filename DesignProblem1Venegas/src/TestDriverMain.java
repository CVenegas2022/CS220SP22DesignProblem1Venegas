import java.util.*;
public class TestDriverMain {

	public static void main(String[] args) {
		
		//test patients
		Patient test = new Patient("Test", 14, "12345");
		
		Patient spacco = new Patient("Prof. Spacco", 14, "220");
		
		Patient joe = new Patient("Joe", 81, "102342");
		
		Patient jim = new Patient("Jim", 2, "101321");
		
		Patient jimbo = new Patient("Jimbo", 0, "100210");
		
		//testing Patient class
		test.printPatient();
		
		//assuming list is sorted in FIFO with additions being added to the end with 0 days in quarantine
		ArrayList<Patient> testList=new ArrayList<Patient>();
		testList.add(jim);
		testList.add(test);
		testList.add(spacco);
		testList.add(joe);
		
		//create Queue
		PatientQueue testQueue=new PatientQueue(testList);
		
		//print out using toStringMethod;
		System.out.println(testQueue.toString());
		
		//test adding
		testQueue.addPatient(jimbo);
		
		System.out.println(testQueue.toString());
		
		//test dequarantine
		testQueue.dequarantine();
		
		System.out.println(testQueue.toString());
		
		
	}

}
