public class Role {
    int HP,MP,ATTACK; //data member
    String position,skill;


    Role(int roleHP, int roleMP, int roleATTACK,String roleposition,String roleskill) {
        HP= roleHP;
        MP= roleMP;
        ATTACK = roleATTACK;
        position=roleposition;
        skill=roleskill;
    }

    void getCurrentStatus() {
        System.out.println("My position is "+position);
        System.out.println("My skill is " + skill);
        System.out.println("HP:" + HP);
        System.out.println("MP:" + MP);
        System.out.println("ATTACK:" + ATTACK);
    }
}
