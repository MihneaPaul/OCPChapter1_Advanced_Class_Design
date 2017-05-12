/**
 * Created by Mihnea on 04.05.2017.
 */
public class ToStringTest {
}
class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Name: "+name+", weight: "+weight;
    }


    public static void main(String[] args) {
        Hippo hippo1 = new Hippo("Harry",3100);
        System.out.println(hippo1);
    }
}
