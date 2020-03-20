public class person {
    String name;
    int age;
    int height;
    int stamina;


    public void run() {
        stamina--;
    }
    public void sleep() {
        stamina += 12;

    }

    public boolean isMajor() {
        return age >= 18;
        }

        public String whatsYourName() {
        return name;


    }

    public static void main(String[] args) {
        int x = 3;
        if(x>1 && x<5)
            System.out.println(" x is between 1 and 5 ");
        else
            System.out.println(" x is not between 1 and 5");
    }

}
