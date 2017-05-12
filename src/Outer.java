/**
 * Created by Mihnea on 04.05.2017.
 */
public class Outer {
    private String greeting = "Hi";
    protected class Inner {
        public int repeat = 3;
        public void go() {
            for(int i=0;i<repeat;i++)
                System.out.println(greeting);
        }
    }
    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
        System.out.println();

        // sau

        Inner inner = outer.new Inner();
        inner.go();
    }
}
