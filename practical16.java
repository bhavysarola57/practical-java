class Car {
    void Bmw() {
        System.out.println("full form of bmw is Bayerische Motoren Werke");
    }
}


class Mseries extends Car {
    void perfect() {
        System.out.println("this series is loveeeee");
    }
}


class Zseries extends Car {
    void roadsters() {
        System.out.println("okk");
    }
}


public class Main {
    public static void main(String[] args) {
        Mseries suii = new Mseries();
        suii.Bmw();  
        suii.perfect();   

        Zseries suu = new Zseries();
        suu.Bmw();  
        suu.roadsters();  
    }
}