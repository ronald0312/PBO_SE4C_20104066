package latihan;

public class Carnivor extends Animal{
    String type = "Cat";
    int age = 3;

    public Carnivor(String type, int age) {
        super("Tiger",4);
    }

    public static void main(String[] args) {
        Carnivor carnivor = new Carnivor("",0);
        System.out.println("Take Grades From Animal Class");
        carnivor.getCarnivor();

        System.out.println("Take Grades From Animal Class");
        System.out.println("Animal type" +carnivor.getType());

    }
    void getCarnivor(){
        System.out.println("Animal type : "+super.getType());
        System.out.println("Animal age"+super.getAge());
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getAge() {
        return age;
    }
}
