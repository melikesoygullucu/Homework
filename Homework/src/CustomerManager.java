
public class CustomerManager {

	public void Add(Customer customer) {
		System.out.println("Sisteme eklendi: " + customer.name);
	}

	public void Delete(Customer customer) {
		System.out.println("Sistemden silindi: " + customer.name);
	}
}
