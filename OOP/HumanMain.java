public class HumanMain {
    public static void main(String[] args) {
        Human vamshi = new Human(21, "Vamshi Krishna", 10000, false);
        Human Samuel = new Human(21, "Samuel", 15000, true);
        Human Samuel2 = new Human(21, "Samuel", 15000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        greeting();
    }

    static void greeting() {
        System.out.println("Hello world");
    }

    void greeting2() {
        greeting(); // static can be in non static but non static cannot be in static
        System.out.println("hello");
    }

    static void fun() {
        // greeting2(); //we cant access non static data in static data
        HumanMain obj = new HumanMain(); // you cannot accesss non static stuff without referencing their instances in a
                                         // static context //So we are referencing it.
        obj.greeting2();
    }
}
