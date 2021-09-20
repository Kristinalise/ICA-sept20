import java.util.ArrayList;

class Manager{

	private String name;
	private Employee employee;
	private ArrayList<Employee> elist = new ArrayList<>();

	public Manager(String theName, Employee theEmployee){
		name = theName;
		employee = theEmployee;
		elist.add(theEmployee);

	}

	public void pay(Employee emp, int newPay){
		emp.setPay(newPay);
	}

	public int getEmpPay(){
		int p = 0;
		for(Employee e: elist){
			p += e.getPay();
		}
		return p;
	}

	public void addEmp(Employee e1){
		if(!elist.contains(e1)){
			elist.add(e1);
		}else{
			System.out.println("Not added, already in list.");
		}
	}

	public ArrayList<Employee> getEmp(){
		return elist;
	}

	public void setEList(ArrayList<Employee> es){
		elist = es;
	}

	public String getName(){
		return name;
	}

	public String toString(){
		return "Name: " + name + ", employee(s): " + elist;
	}

}