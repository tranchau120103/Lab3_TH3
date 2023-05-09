package Lab3;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
	    Order order = new Order(1, LocalDate.of(2023, 5, 9));

	    order.addLineItem(new Product("sp4", "Nuoc tuong", 8000), 10);
	    order.addLineItem(new Product("sp1", "Gao", 18000), 5);
	    order.addLineItem(new Product("sp4", "Duong", 10000), 1);
	    order.addLineItem(new Product("sp1", "Gao", 18000), 1);

	    System.out.println(order.toString());
	}
}
