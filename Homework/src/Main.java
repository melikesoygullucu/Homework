
public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.id = 1;
		customer1.name = "�rem S�la";
		customer1.surname = "Y�ld�r�m";
		customer1.dateOfBirth = 2001;

		Customer customer2 = new Customer();
		customer2.id = 2;
		customer2.name = "Melike";
		customer2.surname = "Soyg�ll�c�";
		customer2.dateOfBirth = 2001;

		Customer customer3 = new Customer();
		customer3.id = 3;
		customer3.name = "Hakan";
		customer3.surname = "Tekba�";
		customer3.dateOfBirth = 2000;

		CustomerManager manager = new CustomerManager();
		Customer[] customers = { customer1, customer2, customer3 };
		for (int i = 0; i < customers.length; i++) {
			manager.Add(customers[i]);
			manager.Delete(customers[i]);

		}
	}

}
