class Outer {
    String s = "outer";

    public static void doStuff() {
        int i = 10;
        class Inner {

            void show() {
                System.out.println(i);
            }
        }
        Inner in = new Inner();
        in.show();
    }

}//class
