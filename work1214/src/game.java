public class game {
    public static void main(String[] args) {
        Role Archer = new Role(40, 15, 20,"Archer","射箭");
        Archer.getCurrentStatus();
        System.out.println("----------------------------");
        Role Berserker = new Role(50, 10, 15,"Berserker","揮劍");
        Berserker.getCurrentStatus();
        System.out.println("----------------------------");
        Role Magician = new Role(30, 20, 25,"Magician","施法");
        Magician.getCurrentStatus();
        System.out.println("----------------------------");

        Part1 Part1 = new Part1("Archer & Berserker","附魔弓箭",5,"王者之劍",10,
                                25,10,25,15,
                                15,5,25,25,-5,25);
        Part1.getCurrentStatus();
        System.out.println("----------------------------");
    }
}
