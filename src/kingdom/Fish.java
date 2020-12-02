package kingdom;

public class Fish extends AbstractAnimal {
	public Fish(String name, int year) {
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
	public String move() {
		return "swim";
	}

	@Override
	public String breath() {
		return "gills";
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