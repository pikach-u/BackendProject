//0613 getter-setter

class AdultPerson{
    public String name;
    public int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 18){
            System.out.println("Only Adult");
        } else{
            this.age = age;
        }
    }
}

public class Main_0613 {
    public static void main(String[] args) {

        AdultPerson person = new AdultPerson();
        person.setName("pikachu");

        System.out.println(person.getName());
    }
}
