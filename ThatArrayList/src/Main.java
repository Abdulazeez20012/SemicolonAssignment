import static jdk.internal.org.jline.utils.Colors.M;

/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Cohort = new ArrayList<String>();
        Cohort.add(0,"Twenthy two");
        Cohort.add(0,"Twenty three");
        Cohort.add(0,"Twenty four");
        Cohort.add( 0,"Twenty five");
        Cohort.add( 0,"Twenty Six");

        for (String i : Cohort) {
            System.out.println(i);
        }
            System.out.println(Cohort.get(i));

        }
    }
}

 */
public class Main {
        private String name;
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public static void main(String[] args) {
            Main main = new Main();
            System.out.println(main.getName());
        }
        public Main() {
            main(null);
        }

    }