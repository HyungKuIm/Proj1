/**
 * Item을 생성하는 프로그램
 */

/**
 * @author HyungKu Im
 */
public class Sample001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Item item = new Item("책1", 10);  // Item의 인스턴스 생성
		System.out.println("아이템: " + item.getItem() 
		    + ", 수량: " + item.getQuantity());

	}

}
