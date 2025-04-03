class Car {
  
    String name;

   
    Car(String name) {
        this.name = name;
    }

    void Drift() {
        System.out.println(name + " makes perfect suiiiiiiii");
    }
}

class Bmw extends Car {

  
   Bmw(String name) {
    
        super(name);
    }

    void speed() {
        System.out.println(name + " top speed 3+ kmph");
    }
}


public class Main {
    public static void main(String[] args) {
   
        Bmw Suiii = new Bmw("Bmw m101cs");

        Suiii.Drift();  
        Suiii.speed();  
    }
}