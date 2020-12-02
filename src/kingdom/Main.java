package kingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static ArrayList<AbstractAnimal> filtered = new ArrayList<AbstractAnimal>();

    public static void printAnimals(List<AbstractAnimal> animals, CheckAnimal tester) {
        filtered.clear();

        for(AbstractAnimal animal: animals) {
            if(tester.test(animal)) {
                System.out.println(animal.getName() + " " + animal.getYear()+ " " + animal.move()+ " " + animal.breath()+ " " + animal.reproduce());
                filtered.add(animal);
            }
        }
    }

	public static void main(String[] args) {
		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);


		List<AbstractAnimal> myList = new ArrayList<>();

		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);

		System.out.println("\nPrint in Descending order by Year \n");
		myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
		myList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));

		System.out.println("\nPrint Alphabetically\n");
		myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		myList.forEach((a) -> System.out.println(a));

		System.out.println("\n Print By Movement\n");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myList.forEach(animal -> System.out.print(animal.getName() + " " + animal.move() + "\n"));

        System.out.println("\n Print Animals that Breathe with Lungs\n");
        printAnimals(myList, animal -> animal.breath() == "lungs");

        System.out.println("\nBreathes with Lungs and named in 1758\n");
        printAnimals(myList, animal -> animal.breath() == "lungs" && animal.getYear() == 1758);

        System.out.println("\nLays eggs and breathes with lungs\n");
        printAnimals(myList, animal -> animal.breath() == "lungs" && animal.reproduce() == "eggs");

        System.out.println("\nNamed in 1758 alphabetically\n");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(myList, animal -> animal.getYear() == 1758);
	}
}