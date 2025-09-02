/**
 * 
 */

/**
 * 
 */
public class Sample002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//byte(1), short(2), int(4), long(8), char(2), float(4), double(8), boolean
		byte b = 1;
		short s = 500;
		int i = 50000;
		long l = 1000000000000L;
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		
		char c = '구';
		System.out.println("c = " + c);
		
		float f = 1.1f;
		System.out.println("f = " + f);
		
		double d = 3.141592;
		System.out.println("d = " + d);
		
		boolean gender = false;   // 남성 true, 여성 false
		System.out.println(gender);
		
		//String 문자열
		// 이름, 주소, 전화번호....
		String name = "임형구";
		System.out.println(name);
		
		String addr = "인천 부평구";
		System.out.println(addr);
		
		String name1, name2;
		name1 = name2 = "오예스";
		System.out.println(name1);
		System.out.println(name2);
		
		
	}

}
