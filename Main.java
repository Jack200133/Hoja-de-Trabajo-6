import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    MapFactory mf = new MapFactory();
    Scanner scan = new Scanner(System.in);
    Map datos; 
    Map collecion;

    System.out.println("Ingrese que tipo de Map se implementara:");
    System.out.println("1. HashMap");
    System.out.println("2. LinkedHashMap");
    System.out.println("3. TreeMap ");

    int op = scan.nextInt();
        
    String res = "";
    if(op ==1){
      res = "HM";
    }
    else if(op ==2){
      res = "";
    }
    else if(op ==3){
      res = "TM";
    }else{
      res = "";
    }

    datos = mf.getMAP(res);
    collecion = mf.getMAP(res);
    
    try {
      File myObj = new File("cards_desc.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] temp = data.split("\\|");
        datos.put(temp[0],temp[1]);

      }
      myReader.close();
    }catch (Exception e) {
      System.out.println("Archivo no encontrado");
      e.printStackTrace();
    }
   
    while (true){

      System.out.println("\nIngrese que desea hacer\n");
      System.out.println("1. Agregar una carta a la coleccion");
      System.out.println("2. Mostrar el tipo de una carta específica.");
      System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta en la coleccion");
      System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta, ordenadas por tipo en la coleccion.");
      System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes. ");
      System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo. ");

      op = scan.nextInt();

      if(op ==1){
        // agregar carta
        System.out.println("Ingrese el nombre de la carta que desea agregar");
        
        String ca = scan.nextLine();
        ca = scan.nextLine();
        if(datos.containsKey(ca)){
          collecion.put(ca, datos.get(ca));
          System.out.print("Carta Agregada");
        }else{
          System.out.print("Carta no disponible");
        }
      }
      else if(op ==2){
       //mostrar carta especifica
       System.out.println("Ingrese el nombre de la carta");
        
        String ca = scan.nextLine();
        ca = scan.nextLine();
        if(datos.containsKey(ca)){
          
          System.out.print("El tipo de " + ca + " es " + datos.get(ca));
        }else{
          System.out.print("Carta no disponible");
        }
      }
      else if(op ==3){
       //mostrar cartas en coleccion
       Object[] list = collecion.entrySet().toArray();
       for(int i = 0; i <list.length; i++){
          String temp = list[i].toString();
          String[] lol =  temp.split("=");
          System.out.println("\nNombre: " + lol[0] + ",\t Tipo: " + lol[1] + " Cantidad: ");
       }
      }else if(op ==4){
        Object[] list = collecion.entrySet().toArray();

       for(int i = 0; i <list.length; i++){
          String temp = list[i].toString();
          String[] lol =  temp.split("=");
          if(lol[1].equals("Hechizo")){
            System.out.println("Nombre: " + lol[0] + ",\t Tipo: " + lol[1] + " Cantidad: ");
          }
       }
       for(int i = 0; i <list.length; i++){
          String temp = list[i].toString();
          String[] lol =  temp.split("=");
          if(lol[1].equals("Monstruo")){
            System.out.println("Nombre: " + lol[0] + ",\t Tipo: " + lol[1] + " Cantidad: ");
          }
       }
       for(int i = 0; i <list.length; i++){
          String temp = list[i].toString();
          String[] lol =  temp.split("=");
          if(lol[1].equals("Trampa")){
            System.out.println("Nombre: " + lol[0] + ",\t Tipo: " + lol[1] + " Cantidad: ");
          }
       }
       //mostrar cartas en collecion ordenadas por tipo
      }
      else if(op ==5){
       //mostrar cartas
       Object[] list = datos.entrySet().toArray();
       for(int i = 0; i <list.length; i++){
          String temp = list[i].toString();
          String[] lol =  temp.split("=");
          System.out.println("\nNombre: " + lol[0] + ",\t Tipo: " + lol[1]);
       }
      }
      else if(op ==6){
       //mostrar cartas ordenadas por tipo 
      }else{
        System.out.print("\nOpcion no esta en el menu\n");
      }
      
    }
  }
}