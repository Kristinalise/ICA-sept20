class Employee{
	
	private String name;
	private int pay;

	public Employee(String theName, int thePay){
		name = theName;
		pay = thePay;
	}

	public int getPay(){
		return pay;
	}

	public String getName(){
		return name;
	}

	public void setPay(int theNewPay){
		pay = theNewPay;
	}

	public String toString(){
		return "Name: " + name + ", pay: " + pay + ".";
	}

	public boolean equals(Object e){
		boolean same = false;

        if (e != null && e instanceof Employee)
        {
            same = this.name.equals(((Employee) e).name) && this.pay == (((Employee) e).pay);
        }

        return same;
    }
}

