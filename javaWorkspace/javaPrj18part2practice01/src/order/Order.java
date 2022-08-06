package order;

public class Order {
	
	public Order(boolean isTakeOut, int dough, int topping, int side, int drink, int price, int time) {
		this.isTakeOut = isTakeOut;
		this.dough = dough;
		this.topping = topping;
		this.side = side;
		this.drink = drink;
		this.price = price;
		this.time = time;
	}
	
	//data
	private boolean isTakeOut;
	private int dough;
	private int topping;
	private int side;
	private int drink;
	private int price;
	private int time;
	
	//getter, setter
	public boolean isTakeOut() { //boolean 타입은 관습처럼 is뭐뭐로 변수 지음. => getter도 자동완성으로 만들게 되면
		return isTakeOut;		// getIsTakeOut이 아니고 그냥 isTakeOut로 나옴
	}
	public void setTakeOut(boolean isTakeOut) {
		this.isTakeOut = isTakeOut;
	}
	public int getDough() {
		return dough;
	}
	public void setDough(int dough) {
		this.dough = dough;
	}
	public int getTopping() {
		return topping;
	}
	public void setTopping(int topping) {
		this.topping = topping;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getDrink() {
		return drink;
	}
	public void setDrink(int drink) {
		this.drink = drink;
	}
	public int getPrice() {
		return price;
	}
	public void addPrice(int price) {
		this.price += price;
	}
	public int getTime() {
		return time;
	}
	public void addTime(int time) {
		this.time += time;
	}
	
	@Override
	public String toString() {
		return "Order [isTakeOut=" + isTakeOut + ", dough=" + dough + ", topping=" + topping + ", side=" + side
				+ ", drink=" + drink + ", price=" + price + ", time=" + time + "]";
	}
	
	
	
	
	//method
	
	
	
	
	
	
	
	
	
	
}//class
