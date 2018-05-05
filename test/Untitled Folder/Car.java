import java.lang.Object;
public class Car implements Comparable<Car> {
    int number;
    String name;

    //constructor
    public Car(int number, String name) {
        this.number = number;
        this.name = name;
    }

    //getters and setters
    public int getNumber() {
        return this.number;
    }
    public String getName() {
        return this.name;
    }

    public String toString() {
        return ""+this.number+"-"+this.name;
    }

    public int hashCode() {
        return this.number*10;
    }

    public boolean equals(Object o) {
        if (o instanceof Car) {
                Car c = (Car) o;
                return (c.getName().equals(name) && c.number == this.number);
        }
        else {
            return false;
        }
    }

    public int compareTo(Car c) {
        return name.compareTo(c.getName());
    }

    public void show() {
        System.out.println(this.name);
    }

}
