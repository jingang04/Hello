package 수행연습2;

public class ItemMain {

	public static void main(String[] args) {
		System.out.println(Item.getCompany() + "에 오신 걸 환영합니다!");
		System.out.println("현재 상품 종류 개수 : " + Item.getItemCnt() + "개");
		
		System.out.println("=====================================================================");
		
		Item pen = new Item();
		pen.setNo(100);
		pen.setName("연필");
		pen.setPrice(600);
		pen.setCount(5);
		
		pen.printInfo();
		
		Item note = new Item(101, "노트");
		note.setPrice(1000);
		note.setCount(4);
		
		note.printInfo();
		
		Item er = new Item(102, "지우개", 500, 5);
		
		er.printInfo();
		
		System.out.println("=====================================================================");
		
		System.out.println("현재 상품 종류 개수 : " + Item.getItemCnt() + "개");
		
		System.out.println("=====================================================================");
		
		pen.inStore(10);
		note.inStore(20);
		note.outStore(5);
		er.inStore(20);
		er.outStore(26);
		
		System.out.println("=====================================================================");
		
		pen.printInfo();
		note.printInfo();
		er.printInfo();
	}

}
