
public class Item {
	private int no;
	private String name;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getItemCnt() {
		return itemCnt;
	}
	public static void setItemCnt(int itemCnt) {
		Item.itemCnt = itemCnt;
	}
	public static String getCompany() {
		return company;
	}
	private int price;
	private int count;
	private static final String company = "놀러와 회사";
	private static int itemCnt;
	
	Item() {
		itemCnt++;
	}
	Item(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}
	Item(int no, String name, int price, int count){
		this(no, name);
		this.price = price;
		this.count = count;
	}
	
	void printInfo() {
		System.out.println("상품코드 : " + no + " 상품명 :" + name + 
				" 상품가격 : " + price + " 상품개수 : " + count );
	}
	
	void inStore(int cnt) {
		count += cnt;
		System.out.println("입고 : " + name + ", " + cnt + "개");
	}
	
	void outStore(int cnt) {
		if(cnt <= count) {
			count = count - cnt;
			System.out.println("출고 : " + name + ", " + cnt + "개");
		} else {
			System.out.println("출고 실패 : " + name + ", " + "현재재고 : " + count + "개");
			
		}
	}
}
