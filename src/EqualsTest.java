/**
 * Created by Mihnea on 04.05.2017.
 */
public class EqualsTest {
}
class Tiger {
    private int idNumber;
    private int age;
    private String name;

    public Tiger(int idNumber, int age, String name) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }
//    @Override
//    public boolean equals(Object object) {
//        if(!(object instanceof Tiger)) return false;
//        Tiger otherTiger = (Tiger) object;
//        return this.idNumber == otherTiger.idNumber;
//    }

    @Override
    public int hashCode() {
        return idNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tiger tiger = (Tiger) o;

        return idNumber == tiger.idNumber;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "idNumber=" + idNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger(1,2,"Tom");
        Tiger tiger2 = new Tiger(2,4,"Tim");
        Tiger tiger3 = new Tiger(1,5,"Terry");
        System.out.println(tiger1.equals(tiger2));
        System.out.println(tiger1.hashCode());
        System.out.println(tiger1);
        System.out.println(tiger2);
        System.out.println(tiger3);
        System.out.println();
        for(Season season : Season.values()) {
            System.out.println(season.name()+" "+season.ordinal());
        }
        System.out.println();
        System.out.println(Season.FALL);
    }

}
enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;
    Season(String expectedVisitors) {
        this.expectedVisitors=expectedVisitors;
    }
//    public void printExpectedVIsitors() {
//        System.out.println(expectedVisitors);
//    }

    @Override
    public String toString() {
        return "Season " + name()+
                ", Expected Visitors Level - '" + expectedVisitors + '\'';
    }
}
enum SeasonHours {
    WINTER {
        public void printHours() {
            System.out.println("9am-3pm"); }
        }, SUMMER {
        public void printHours() {
            System.out.println("9am-7pm");
        }
    }, SPRING,FALL;
            public void printHours() {
                System.out.println("default hours");
            }

    @Override
    public String toString() {
        return name()+" open hours: ";
    }
}
class ZooHourse {
    public static void main(String[] args) {
        SeasonHours.FALL.printHours();
    }
}
