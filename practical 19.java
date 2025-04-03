interface Bhavy {
    void Anger(); 
}


interface Mood {
    void move();
}


class Me implements Bhavy, Mood {
    
    public void Anger() {
        System.out.println("hehehehehe");
    }

   
    public void move() {
        System.out.println("guyyyyyyyyyssss");
    }
}

public class Main {
    public static void main(String[] args) {
      
        Me myd = new Me();

      
        myd.Anger();       
        myd.move();    
    }
}