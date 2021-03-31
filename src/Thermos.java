
public class Thermos {

	float volume;
	String Brand, Liquid;
	
	Thermos(float volume, String Brand, String Liquid){
		this.volume = volume = 0;
		this.Brand = Brand;
		this.Liquid = Liquid;
	}
	
	void addLiquid(double d) {
		if(d <= 1) {
			volume = (float) (volume + d);
		}else {
			System.out.print("The capacity of thermos is 1 litre\n");
		}
	}
	
	void displayDetails() {
		System.out.print("Brand: "+Brand);
		System.out.print("\nLiquid: "+Liquid);
		System.out.print("\nVolume(in Litres): "+volume);
	}
	public static void main(String[] args) {
		Thermos godrej = new Thermos(1, "Godrej", "Orange Juice");
		godrej.addLiquid(0.4);
		godrej.displayDetails();
	}

}
