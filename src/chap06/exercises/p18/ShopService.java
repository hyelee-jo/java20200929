package chap06.exercises.p18;

public class ShopService {
	private final static ShopService ins = new ShopService();

	private ShopService() {
		
	}

	public static ShopService getInstance() {
		return ins;
	}

}
