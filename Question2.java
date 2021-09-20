class Question2 {

	public static void F2 (Employee e1, Employee e2) {
		e1 = e2 ;
		e1.setPay(12);
	}

	public static void main (String [] args) {
		Employee abel = new Employee (" Abel ", 7);
		Employee betty = new Employee (" Betty ", 10);
		F2(abel , betty);
		System.out.println (abel + ", " + betty);
	}
}