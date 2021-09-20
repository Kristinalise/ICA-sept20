class Question3 {
	public static void F4 (Employee e1) {
		Manager bill = new Manager (" Bill ", e1 );
		bill.pay(e1, 2);
	}

	public static void main ( String [] args ) {
		Employee peter = new Employee (" Peter ", 25);
		Manager glinda = new Manager (" Glinda ", peter );
		F4(peter);
		System.out.println(glinda.getEmpPay());
	}
}