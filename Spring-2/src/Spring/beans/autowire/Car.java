package Spring.beans.autowire;

public class Car {

	private String brond;
	private String crop;
	private int maxspeed;
	private double price;
	public String getBrond() {
		return brond;
	}
	public void setBrond(String brond) {
		this.brond = brond;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brond=" + brond + ", crop=" + crop + ", maxspeed=" + maxspeed + ", price=" + price + "]";
	}
	
	public Car() {
		System.out.println("Car's constructor......");
	}
	
}
