import java.util.ArrayList;

class Question5{
	
	public static void F5(Manager m){
		ArrayList<Employee> e = m.getEmp();
		Employee stranger = new Employee("stranger", 1000);
		e.remove(0);
		e.add(stranger);
	}

	public static void F6(Manager m){
		String name = m.getName();
		name = "Notmyname";
	}

	public static void main(String[] args){

		Employee bob = new Employee("Bob", 4);
		Manager sam = new Manager("Sam", bob);
		ArrayList<Employee> list = sam.getEmp();
		
		F5(sam);
		
		System.out.println(sam.getEmpPay());
		
		System.out.println(sam.getName());
		
		Employee john = new Employee("John", 5);
		Employee ben = new Employee("Ben", 40);
		ArrayList<Employee> mylist = new ArrayList<>();
		mylist.add(john);
		mylist.add(ben);
		sam.setEList(mylist);
		mylist.set(1, john);
		System.out.println(sam.getEmp());

	}


}