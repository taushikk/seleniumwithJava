package com.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line1", "Delhi", "India", "AnarMasjic", "110094");
		Customer customer = new Customer("Taushik", homeAddress);
		Address workAddress = new Address("line1", "Gurgaon", "India", "CyberCity", "122002");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);

	}

}
