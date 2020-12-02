package kingdom;

abstract class AbstractAnimal {
	private static int maxId = 0;

	protected int id;
	protected String name;
	protected int year;

	public AbstractAnimal() {
		maxId++;
		id = maxId;
	}

	public AbstractAnimal(String name, int year) {
		maxId++; 
		id = maxId;

		this.name = name;
		this.year = year;
	}

	String eat() {
		return "Eat";
	}

	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();
}