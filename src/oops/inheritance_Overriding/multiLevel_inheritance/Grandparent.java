package oops.inheritance_Overriding.multiLevel_inheritance;

public class Grandparent {
    private String name;
    private int age;
    boolean hasSuperPower;

    public Grandparent(int age, String name){  //constructor
        this.age = age;
        this.name = name;
        hasSuperPower = false;
        System.out.println("This is grand parent constructor called");
    }


    public void setHasSuperPower(boolean hasSuperPower) {
        this.hasSuperPower = hasSuperPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


// here "this" means current instance means kihm jis b class ki object bna rhe he us object ko denote krte he this se
// same as we are having super() keyword also
// super denotes parent class means ki uski parent class kon he
