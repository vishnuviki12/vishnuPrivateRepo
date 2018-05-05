import java.util.List;

public class AnimalDoctor {

    public void checkAnimal(List<? super Dog> animal) {

        animal.add(new Dog());

        for (Object d: animal) {
            System.out.println(d);
        }

    }
}
