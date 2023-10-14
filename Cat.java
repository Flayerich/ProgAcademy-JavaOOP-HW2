package hw2;

class Cat extends Animal {
	private String name;
	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getVoice() {
		return "Мяу-мяу";
	}
	@Override
	public void eat() {
		System.out.println("Котик ість");
	}
	@Override
	public void sleep() {
		System.out.println("Котик спить");
	}
}
