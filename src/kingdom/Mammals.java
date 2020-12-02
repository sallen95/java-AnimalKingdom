package kingdom;

public class Mammals extends AbstractAnimal {
	public Mammals(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String breath() {
		return "lungs";
	}

	@Override
	public String move() {
		return "walk";
	}

	@Override
	public String reproduce() {
		return "live births";
	}

	@Override
	public String toString() {
		return name + " " + reproduce() + " " + move() + " " + breath() + " " + year;
	}
}