package chap13.textbook.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); // String->Object (자동타입변환)

		Object o = box.get();

		if (o instanceof String) {
			String name = (String) o;
		}

		box.set(new Apple());

		o = box.get();
		if (o instanceof Apple) {
			Apple apple = (Apple) o;
		}

	}

}
