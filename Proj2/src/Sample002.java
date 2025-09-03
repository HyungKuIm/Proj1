/**
 * ArrayList를 생성하고 추가하는 예제
 */

import java.util.ArrayList;

/**
 * @author HyungKu Im
 */
public class Sample002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> books = new ArrayList<String>();
		books.add("책1");
		books.add("책2");
		books.add("책3");
		
		for (String book : books) {
			System.out.println(book);
		}

	}

}
