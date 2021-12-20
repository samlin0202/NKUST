public class Part3 {
    int HPMagician,MPMagician;
    int HPBerserker,MPBerserker;
    int NewHpM,NewMpM,NewAttackM;
    int NewHpB,NewMpB,NewAttackB;
    int WearAttackM,WearAttackB;
    String WearMagician,WearBerserker;
    String round;


    Part3(String partround,String partWearMagician,int partWearAttackM,String partWearBerserker,int partWearAttackB,
          int partHPMagician,int partMPMagician,int partHPBerserker,int partMPBerserker,
          int partNewHpM,int partNewMpM,int partNewAttackM,int partNewHpB,int partNewMpB,int partNewAttackB) {
        round=partround;
        WearMagician=partWearMagician;
        WearAttackM=partWearAttackM;
        WearBerserker=partWearBerserker;
        WearAttackB=partWearAttackB;

        HPMagician= partHPMagician;
        MPMagician= partMPMagician;
        HPBerserker=partHPBerserker;
        MPBerserker=partMPBerserker;

        NewHpM=partNewHpM;
        NewMpM=partNewMpM;
        NewAttackM=partNewAttackM;
        NewHpB=partNewHpB;
        NewMpB=partNewMpB;
        NewAttackB=partNewAttackB;
    }

    void getCurrentStatus() {
        System.out.println("第三回合 "+round);
        System.out.println("Magician配戴"+WearMagician+" ATTACK+"+WearAttackM);
        System.out.println("Berserker配戴"+WearBerserker+" ATTACK+"+WearAttackB);

        System.out.println("----------START----------");
        System.out.println("Magician:HP-"+HPMagician+" MP-"+MPMagician);
        System.out.println("Berserker:HP-"+HPBerserker+" MP-"+MPBerserker);
        System.out.println("-----------END-----------");

        System.out.println("Magician's New State:");
        System.out.println("HP:" + NewHpM);
        System.out.println("MP:" + NewMpM);
        System.out.println("ATTACK:" + NewAttackM);
        System.out.println("Berserker's New State:");
        System.out.println("HP:" + NewHpB);
        System.out.println("MP:" + NewMpB);
        System.out.println("ATTACK:" + NewAttackB);
    }
}
