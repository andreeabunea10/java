public class program {
    public static void main(String[] args) {
        person alex = new person();
                alex.name = "Alexandru";
                alex.age = 20;
                alex.height = 175;
                alex.age++;
                alex.stamina = 10;


        System.out.println(alex.name + " are " +  alex.age + "de ani");

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.name + " are energia " + alex.stamina);
        alex.sleep();
        System.out.println(alex.name + " are energia " + alex.stamina);

        if(alex.isMajor()) {
            System.out.println(alex.name + " drinks beer ");
        }
    }
}
