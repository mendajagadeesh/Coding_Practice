public class EncapsulationPractice {
    public static void main(String args[]){
        person p=new person();
        p.Name("Jagadeesh");
        p.Age(21);
        p.profession("student");
    }
}

class person{
    private int id;
    private String name;
    private int age;
    private String profession;

    private void id(int id){
        this.id=id;
        System.out.println("Id :"+id);
    }

    protected void Name(String name){
        this.name=name;
        System.out.println("Name :"+name);
        id(516);
    }

    void Age(int age){
        this.age=age;
        System.out.println("Age :"+age);
    }

    public void profession(String profession){
        this.profession=profession;
        System.out.println("profession :"+profession);
    }
}