public class Play {
    public static void main(String[] args) {
        Person Archer = new Person();
        Archer.name = "Archer";
        Archer.hp= 15;
        Archer.Att = 30;
        Archer.Mp = 10;
        // call the method member
        Archer.ShoutMyName();
        System.out.println("My hp: " +Archer.gethp() );
        System.out.println("My Att: " + Archer.getAtt() );
        System.out.println("My mp: " + Archer.getMp() );
        System.out.println("==================================");
        Person Berserker = new Person();
        Berserker.name = "Berserker";
        Berserker.hp= 20;
        Berserker.Att = 15;
        Berserker.Mp = 5;
        Berserker.ShoutMyName();
        System.out.println("My hp: " + Berserker.gethp() );
        System.out.println("My Att: " + Berserker.getAtt() );
        System.out.println("My mp: " + Berserker.getMp() );
        System.out.println("==================================");
        Person Magician = new Person();
        Magician.name = "Archer";
        Magician.hp= 10;
        Magician.Att = 40;
        Magician.Mp = 30;
        // call the method member
        Magician.ShoutMyName();
        System.out.println("My hp: " +Magician.gethp() );
        System.out.println("My Att: " + Magician.getAtt() );
        System.out.println("My mp: " + Magician.getMp() );
        System.out.println("==================================");
//        Person Mike, Judy;
//        Mike = new Person();
//        Judy = new Person();


    }
}
