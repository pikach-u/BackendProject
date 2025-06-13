//0613 polymorphism

class Animall{
    public void makeSound(){
        System.out.println();
    }
}

class Dogg extends Animall{
    @Override
    public void makeSound(){
        System.out.println("boww");
    }
}

class Catt extends Animall{
    @Override
    public void makeSound(){
        System.out.println("meoww");
    }
}

class Quokka extends Animall{
    @Override
    public void makeSound(){
        System.out.println("wakk");
    }
}

public class Main_0613 {
    public static void main(String[] args) {
        Animall a1 = new Dogg();
        Animall a2 = new Catt();
        Animall a3 = new Quokka();

        Animall[] animalls = {a1,a2,a3};

        for(Animall animall : animalls){
            animall.makeSound();
        }


    }
}
