
public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "에 오신것을 환영합니다.");
		System.out.println("현재 상품 종류 개수 : " + Item.getItemCnt());
		System.out.println("=========================");
		Item item1 = new Item();
		item1.setNo(100);
		item1.setName("연필");
		item1.setPrice(600);
		item1.setCount(5);
		
		Item item2 = new Item(101, "노트");
		item2.setPrice(1000);
		item2.setCount(4);
		
		Item item3 = new Item(102, "지우개", 500, 5);
		
		item1.printInfo();
		item2.printInfo();
		item3.printInfo();
		System.out.println("=========================");		
		System.out.println("현재 상품 종류 개수 : " + Item.getItemCnt());
		System.out.println("=========================");
		
		item1.inStore(10);
		item2.inStore(20);
		item2.outStore(5);
		item3.inStore(20);
		item3.outStore(100);
		System.out.println("=========================");

		item1.printInfo();
		item2.printInfo();
		item3.printInfo();
		
	}

}
