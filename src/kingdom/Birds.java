package kingdom;

public class Birds extends AbstractAnimal {
	public Birds(String name, int year) {
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
		return "fly";
	}

	@Override
	public String reproduce() {
		return "eggs";
	}

	@Override
	public String toString() {
		return name + " " + reproduce() + " " + move() + " " + breath() + " " + year;
	}
}