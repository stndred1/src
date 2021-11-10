public class Laptop extends Puter implements portable{
    
    public Laptop(){

    }

    @Override
    public void videos(){
        System.out.println("Estas viendo un video en la laptop\n");
    }
    @Override 
    public void webs(){
        System.out.println("Estas viendo estas viendo el sito en la laptop\n");
    }
    @Override 
    public void games(){
        System.out.println("Estas jugando el juego en la laptop\n");
    }
    @Override
    public void port(){
        System.out.println("Esta diapositiva se puede llevar a cualquier lugar\n");
    }
}
