
public class PizzaMain {

	public static void main(String[] args) {
		Pizza s = new Pizza();
		s.setType("���۽�����");
		s.setSize(12);
		Pizza p = new Pizza("�������� ũ��");
		p.setSize(24);
		Pizza b = new Pizza(12, "�Ұ��");
		s.toPrint();
		p.toPrint();
		b.toPrint();

	}

}
