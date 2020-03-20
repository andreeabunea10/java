import java.time.LocalDateTime;

public class TernaryOperator {
    public static void main(String[] args) {
        int ora= LocalDateTime.now().getHour();
        int minte = LocalDateTime.now().getMinute();

        String perioada = ora >= 12 ? "pm" : "am";


        System.out.println(ora + ":" + minte);
        System.out.println(perioada);

        for (int i = 5 ; i>0 ; i--)
            System.out.println(i);

    }
}
