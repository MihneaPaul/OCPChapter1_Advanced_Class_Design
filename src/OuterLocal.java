/**
 * Created by Mihnea on 04.05.2017.
 */
public class OuterLocal {
    private int length=5;
    public void calculate() {
        final int witdh=20;
        class InnerLocal {
            public void multiply() {
                System.out.println(length*witdh);
            }
        }
        InnerLocal inner = new InnerLocal();
        inner.multiply();
    }

    public static void main(String[] args) {
        OuterLocal outer = new OuterLocal();
        outer.calculate();
    }
}
