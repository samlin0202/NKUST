public class Part1 {
    int HPArcher,MPArcher;//data member
    int HPBerserker,MPBerserker;
    int NewHpA,NewMpA,NewAttackA;
    int NewHpB,NewMpB,NewAttackB;
    int WearAttackA,WearAttackB;
    String WearArcher,WearBerserker;
    String round;
    Part1(String partround,String partWearArcher,int partWearAttackA,String partWearBerserker,int partWearAttackB,
          int partHPArcher,int partMPArcher,int partHPBerserker,int partMPBerserker,
          int partNewHpA,int partNewMpA,int partNewAttackA,int partNewHpB,int partNewMpB,int partNewAttackB){
        round=partround;
        WearArcher=partWearArcher;
        WearAttackA=partWearAttackA;
        WearBerserker=partWearBerserker;
        WearAttackB=partWearAttackB;

        HPArcher= partHPArcher;
        MPArcher= partMPArcher;
        HPBerserker= partHPBerserker;
        MPBerserker= partMPBerserker;

        NewHpA= partNewHpA;
        NewMpA= partNewMpA;
        NewAttackA = partNewAttackA;
        NewHpB=partNewHpB;
        NewMpB=partNewMpB;
        NewAttackB=partNewAttackB;
    }

    void getCurrentStatus() {
        System.out.println("第一回合 "+round);
        System.out.println("Archer配戴"+WearArcher+" ATTACK+"+WearAttackA);
        System.out.println("Berserker配戴"+WearBerserker+" ATTACK+"+WearAttackB);

        System.out.println("----------START----------");
        System.out.println("Archer:HP-"+HPArcher+" MP-"+MPArcher);
        System.out.println("Berserker:HP-"+HPBerserker+" MP-"+MPBerserker);

        System.out.println("-----------END-----------");
        System.out.println("Archer's New State:");
        System.out.println("HP:" + NewHpA);
        System.out.println("MP:" + NewMpA);
        System.out.println("ATTACK:" + NewAttackA);
        System.out.println("Berserker's New State:");
        System.out.println("HP:" + NewHpB);
        System.out.println("MP:" + NewMpB);
        System.out.println("ATTACK:" + NewAttackB);

    }
}
