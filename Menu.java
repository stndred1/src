import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Menu {
 int n;
 Scanner s = new Scanner(System.in);
 String line = "";
 String Name, product, Address;
 int Price, serialNum, NIT, tele;
 public void factura(){
    try{
        String path = "factura.csv";
        String line = "";
        BufferedReader b = new BufferedReader(new FileReader(path));
        while ((line = b.readLine()) != null){
            String[] values = line.split(",");
            System.out.println(line);
        } 
    }catch(IOException e){
            notFound();
        }
}
    public void smartphones(){
        try{
            String path = "smphone.csv";
            String line = "";
            BufferedReader b = new BufferedReader(new FileReader(path));
            while ((line = b.readLine()) != null){
                String[] values = line.split(",");
                System.out.println(line);
            } 
        }catch(IOException e){
                notFound();
            }
    }
    public void menu(){
        
    }
 
    public void notFound(){
        System.out.println("No hay un archivo con ese nombre en el folder\n");
    }
    public void saveRecord(String Name, int NIT, int tele, String Address, String Path, int price){
        System.out.println("Cual es tu nombre?\n");
        Name = s.nextLine();
        System.out.println("Cual es tu NIT\n");
        NIT = s.nextInt();
        System.out.println("Cual es tu numero de telefono actual\n");
        tele = s.nextInt();
        String path = "factura.csv";
        System.out.println("Ingrese la ubicacion del cliente\n");
        Address = s.nextLine();
        System.out.println("Ingrese el precio del diapositivo\n");
        Price = s.nextInt();
        try{
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(Name + "," + NIT + "," + tele + "," + Address);
            pw.flush();
            pw.close();
            System.out.println("Nombre: " + Name +"\tNIT: " + NIT + "Precio: " + price);
        }
        catch(IOException e){
            notFound();
        }
    }
    public void smartPhones(){
        String path = "smphone.csv";
        String line = "";
        try{
        BufferedReader br = new BufferedReader(new FileReader(path));
        System.out.println("Estos son nuestros smart phone\n");
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        }
    catch(IOException e){
        notFound();
    }

    }
}
