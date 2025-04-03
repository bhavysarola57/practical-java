class Bhavy {
   
    void behaviour() {
        System.out.println("heeloo");
    }
}


class happy extends Dhruv {
 
    void moves() {
        System.out.println("majaaa kro ");
    }
}

public class Main {
    public static void main(String[] args) {
      Bhavy myb = new Bhavy();
        myb.behaviour();  

        happy mineb = new happy();
        mineb.moves();  
    }
}