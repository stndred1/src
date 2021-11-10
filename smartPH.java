public class smartPH extends Celly implements web, pics, vids{
    public smartPH(){

    }
    @Override 
    public void port(){
        System.out.println("Este celular se puede llevar a todos los lugares\n");
    }
    @Override
    public void makeCalls(){
        System.out.println("Estas llamando del celular\n");
    }
    @Override
    public void videos(){
        System.out.println("Estas viendo un video en el celular y es de buena calidad\n");
    }
    @Override 
    public void webs(){
        System.out.println("Estas viendo estas viendo el sito en el celular\n");
    }
    @Override
    public void pic(){
        System.out.println("Estas tomando buenas fotos con el celular\n");
    }
}
