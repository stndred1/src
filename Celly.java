public class Celly extends hPhone implements portable {
    public Celly(){

    }
    @Override 
    public void port(){
        System.out.println("Este celular se puede llevar a todos los lugares\n");
    }
    @Override
    public void makeCalls(){
        System.out.println("Estas llamando del celular\n");
    }
}
