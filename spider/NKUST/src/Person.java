public class Person {
    int hp;
    int Att;
    int Mp;
    String name; //data member

    int gethp() {
        //method member
        return this.hp; //this 指向此類別本身
    }
    int getAtt() {
        //method member
        return this.Att; //this 指向此類別本身
    }
    int getMp() {
        //method member
        return this.Mp; //this 指向此類別本身
    }
    String getMyName() {
        return this.name; //this 指向此類別本身
    }

    void ShoutMyName() {
        //method member
        System.out.println("I am " + getMyName().toUpperCase() + "."); //於類別內呼叫getMyName函數
    }
}
