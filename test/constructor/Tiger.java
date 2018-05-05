public class Tiger extends Animal {

    public Tiger() {

        //super();
        super(new Animal().name);
        System.out.println("create second");
        
    }

    public Tiger (String name) {
        System.out.println(name);
    }
}
