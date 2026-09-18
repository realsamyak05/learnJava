interface prey{
    void flee();
}


interface predator{
    void hunt(); 
}

class rabbit implements prey{
    @Override 
    public void flee(){
        System.out.println("The rabbit is running.");
    }

}

class fish implements prey, predator{
    @Override 
    public void flee(){
        System.out.println("The fish is swimming away.");
    }

    @Override 
    public void hunt(){
        System.out.println("The Fish is hunting.");
    }
}


class hawk implements predator{
    @Override 
    public void hunt(){
        System.out.println("The hawk is hunting.");
    }
}


public class Main {
    public static void main(String[] args) {
        rabbit jojo = new rabbit();
        jojo.flee();

        hawk pui = new hawk();
        pui.hunt();

        fish nemo = new fish();
        nemo.flee();
        nemo.hunt();
    }
}
