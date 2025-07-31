package Assignment4;
public class Main {
    public static void main(String[] args) {
        AirIndia ai = new AirIndia(5, 2000.50);
        ai.display();

        KingFisher kf = new KingFisher(3, 2500.75);
        kf.display();

        Indigo ig = new Indigo(4, 1800.25);
        ig.display();
    }
}