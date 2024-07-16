
public class Circle extends Shapes {
    @Override // this is called annotation.

    // this will run when obj of circle is created
    // hence it is overriding the parent method
    void area() {
        System.out.println("Area is pi*square of radius.");
    }
}
