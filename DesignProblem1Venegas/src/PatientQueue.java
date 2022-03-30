import java.util.*;

public class PatientQueue{

	private ArrayList<Patient> patientList;
	private PriorityQueue<Patient> queue;
	int numEligible;
	
	PatientQueue(ArrayList<Patient> l)
	{
		patientList = l;
		queue = new PriorityQueue<Patient>();
		for(int i=0; i<patientList.size(); i++)
		{
			if(patientList.get(i).getCanRemove())
			{
				addPatient(patientList.get(i));
				numEligible++;
			}
		}
	}
	
	//get method
	public ArrayList<Patient> getPatientList()
	{
		return patientList;
	}
	public PriorityQueue<Patient> getQueue()
	{
		return queue;
	}
	public int getNumEligible()
	{
		return numEligible;
	}
	
	//other methods
	/**
	 * adds a Patient to the queue and patient list.  returns 0 if patient already exists on list.
	 * @param Patient p
	 * @return whether method worked (0 if not)
	 */
	public int addPatient(Patient p)
	{
		Patient temp=p;
		for(int i=0; i<patientList.size(); i++)
		{
			if(p.getId().equals(patientList.get(i).getId()))
			{
				return 0;
			}
		}
		patientList.add(p);
		queue.add(p);
		return 1;
	}
	
	/**
	 * removes the Patient at the head of the queue and removes them from the ppatientList.
	 * returns 0 if queue is empty.
	 * @return whether method worked (0 if not)
	 **/
	public int dequarantine()
	{
		if(queue.isEmpty())
		{
			return 0;
		}
		Patient temp=queue.poll();
		for(int i=0; i<patientList.size(); i++)
		{
			if(patientList.get(i).getId().equals(temp.getId()))
			{
				patientList.remove(i);
				numEligible--;
			}
		}
		
		return 1;
	}
	
	/**
	 * prints the details of the next Patient retrieved from peek in the queue
	 */
	public void printNextEligible()
	{
		Patient temp=queue.peek();
		System.out.println(temp.getName()+" ID: "+temp.getId()+ "is eligible next ("+temp.getDaysInQuarantine()+" days in quarantine");
	}
	
	//toString method
	public String toString()
	{
		String temp="";
		
		for(int i=0; i<patientList.size(); i++)
		{
			temp+=i+" "+patientList.get(i).getId();
			temp+="\n";
		}
		
		if(temp.equals(""))
		{
			temp+="none\n";
		}
		
		return "Queue is empty?:"+queue.isEmpty()+"\nPatients (IDs): "+temp+"Number of Patients: "+patientList.size()+
				"\nNumber eligible for removal: "+numEligible;
	}
	
	
	
	
	
}
