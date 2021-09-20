class Question1 {
	
	public static void F1 (Employee toReset) {
		toReset = new Employee (" Betty ", 30);
	}

	public static void main (String[] args ) {
		Employee leo = new Employee (" Leonard ", 20);
		F1(leo);
		System.out.println(leo);
	}
}