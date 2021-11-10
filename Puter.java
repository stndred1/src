public class Puter implements vids, web, videwGames {

    public Puter(){

    }
    @Override
    public void videos(){
        System.out.println("Estas viendo un video en la PC\n");
    }
    @Override 
    public void webs(){
        System.out.println("Estas viendo estas viendo el sito en la PC\n");
    }
    @Override 
    public void games(){
        System.out.println("Estas jugando el juego en la PC\n");
    }
}
