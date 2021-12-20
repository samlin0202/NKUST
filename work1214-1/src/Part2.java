public class Part2 {
    int HPArcher,MPArcher; //data member
    int HPMagician,MPMagician;
    int NewHpA,NewMpA,NewAttackA;
    int NewHpM,NewMpM,NewAttackM;
    int WearAttackA,WearAttackM;
    String WearArcher,WearMagician;
    String round;


    Part2(String partround,String partWearArcher,int partWearAttackA,String partWearMagician,int partWearAttackM,
          int partHPArcher,int partMPArcher,int partHPMagician,int partMPMagician,
          int partNewHpA,int partNewMpA,int partNewAttackA,int partNewHpM,int partNewMpM,int partNewAttackM) {
        round=partround;
        WearArcher=partWearArcher;
        WearAttackA=partWearAttackA;
        WearMagician=partWearMagician;
        WearAttackM=partWearAttackM;

        HPArcher= partHPArcher;
        MPArcher= partMPArcher;
        HPMagician= partHPMagician;
        MPMagician= partMPMagician;

        NewHpA= partNewHpA;
        NewMpA= partNewMpA;
        NewAttackA = partNewAttackA;
        NewHpM=partNewHpM;
        NewMpM=partNewMpM;
        NewAttackM=partNewAttackM;
    }

    void getCurrentStatus() {
        System.out.println("第二回合 "+round);
        System.out.println("Archer配戴"+WearArcher+" ATTACK+"+WearAttackA);
        System.out.println("Magician配戴"+WearMagician+" ATTACK+"+WearAttackM);

        System.out.println("----------START----------");
        System.out.println("Archer:HP-"+HPArcher+" MP-"+HPArcher);
        System.out.println("Magician:HP-"+HPMagician+" MP-"+MPMagician);
        System.out.println("-----------END-----------");

        System.out.println("Archer's New State:");
        System.out.println("HP:" + NewHpA);
        System.out.println("MP:" + NewMpA);
        System.out.println("ATTACK:" + NewAttackA);
        System.out.println("Magician's New State:");
        System.out.println("HP:" + NewHpM);
        System.out.println("MP:" + NewMpM);
        System.out.println("ATTACK:" + NewAttackM);
    }
}
