class Question4 {
	public static void F5 (Employee e1) {
		Employee e = e1 ;
		e.setPay(150);
	}

	public static void main (String[] args) {
		Employee jack = new Employee (" Jack ", 100);
		F5(jack);
		System.out.println(jack.getPay());
	}
}