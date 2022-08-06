package menu;

public class Menu {
	
	public Menu(int price, int time) {
		this.price = price;
		this.time = time;
	}

	private int price;
	private int time;
	
	//getter (setter 은 필요 없어서 안함)
	public int getPrice() {
		return price;
	}
	public int getTime() {
		return time;
	}

}
