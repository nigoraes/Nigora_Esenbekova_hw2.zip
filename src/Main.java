import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWalk(19, 28));
    }

    static String shouldWalk(int age, int temp) {
        boolean walk;
        if (age < 20) ;
        walk = temp >= 0 && temp <= 28;
        if (age > 45) ;
        walk = temp >= -10 && temp <= 25;

        walk = temp >= -20 && temp <= 30;

        return walk ? "оставайтесь":" дома";
    }


}