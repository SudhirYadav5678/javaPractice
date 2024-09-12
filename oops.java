
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write");
    }

    public void colorP() {
        System.out.println(this.color);
    }

    // default constructer
    // Pen() {
    // System.out.println("Hello constructer");
    // }

    // pararmeter cconstructer
    // Pen(String color, String type) {
    // this.color = color;
    // this.type = type;
    // }

    // copy constructer
    Pen(Pen pen2) {
        this.color = pen2.color;
    }

    Pen() {

    }
}

public class oops {
    public static void main(String arg[]) {
        Pen pen1 = new Pen(); // object, here Pen() is like constructer function in javascript constructer
                              // is
        // not parametrs.
        pen1.color = "blue";
        pen1.type = "gel";
        // pen1.write();
        // pen1.colorP();

        Pen pen2 = new Pen(pen1); // object
        pen2.color = "green";
        pen2.type = "bluePoint";
        pen2.write();
        pen2.colorP();
    }
}
