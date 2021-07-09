
public class PizzaMain {

	public static void main(String[] args) {
		Pizza s = new Pizza();
		s.setType("슈퍼슈프림");
		s.setSize(12);
		Pizza p = new Pizza("포테이토 크기");
		p.setSize(24);
		Pizza b = new Pizza(12, "불고기");
		s.toPrint();
		p.toPrint();
		b.toPrint();

	}

}
