/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocine;

/**
 *
 * @author Portatil
 */
public class ManejoCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int w=1;
        char a;
        while(w!=0){
            System.out.println("Tiene Tarjeta TARCINE y/n");
            a=lectura.next().charAt(0);
            if (a=='y'){
                System.out.println("--------------------------");
                System.out.println("1 Reservar Voleta");
                System.out.println("2 Comprar Voleta");
                System.out.println("3 Recargar Tarjeta");
                System.out.println("4 Pagar Reservas");
                System.out.println("--------------------------");
                int x;
                x=lectura.nextInt();
                switch(x){
                    case 1:
                        int t;
                        System.out.println("-----------------------");
                        System.out.println("1 General");
                        System.out.println("2 Preferencial");
                        System.out.println("-----------------------");
                        t=lectura.nextInt();
                        if(t==1){
                            reservar();                            
                        }
                        else{
                            reservarb();
                        }
                        break;                
                    case 2:
                        System.out.println("comprar");
                        break;                
                    case 3:
                        System.out.println("Recargar");
                        break;
                    case 4:
                        System.out.println("Pagar");
                        break;
                    default:
                        System.out.println("Opcion no valisa");
                }
            }
            else{
                System.out.println("--------------------------");
                System.out.println("1 Comprar Voleta");
                System.out.println("2 Crear Tarjeta");
                System.out.println("--------------------------");
                int y;
                y=lectura.nextInt();
                switch(y){
                    case 1:
                        System.out.println("comprar");
                        break;                
                    case 2:
                        System.out.println("crear tarjeta");
                        break;       
                    default:
                        System.out.println("Opcion no valisa");
                }
            }
        }
    }
    public static String[][] reservar (){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        String General[][]={{"A01","A02","A03","A04","A05","A06","A07","A08","A09","A10","A11","A12","A13","A14","A15","A16","A17","A18","A19","A20"},
                           {"B01","B02","B03","B04","B05","B06","B07","B08","B09","B10","B11","B12","B13","B14","B15","B16","B17","B18","B19","B20"},
                           {"C01","C02","C03","C04","C05","C06","C07","C08","C09","C10","C11","C12","C13","C14","C15","C16","C17","C18","C19","C20"},
                           {"D01","D02","D03","D04","D05","D06","D07","D08","D09","D10","D11","D12","D13","D14","D15","D16","D17","D18","D19","D20"},
                           {"E01","E02","E03","E04","E05","E06","E07","E08","E09","E10","E11","E12","E13","E14","E15","E16","E17","E18","E19","E20"},
                           {"F01","F02","F03","F04","F05","F06","F07","F08","F09","F10","F11","F12","F13","F14","F15","F16","F17","F18","F19","F20"},
                           {"G01","G02","G03","G04","G05","G06","G07","G08","G09","G10","G11","G12","G13","G14","G15","G16","G17","G18","G19","G20"},
                           {"H01","H02","H03","H04","H05","H06","H07","H08","H09","H10","H11","H12","H13","H14","H15","H16","H17","H18","H19","H20"}};
        String Reserva[][]=new String[8][20];            
        String z;            
        System.out.println("-------------------------");
        System.out.println("Seleccionar No Silla");
        System.out.println("-------------------------");
        z=lectura.next();        
        for(int i=0;i<8;i++){
            for(int j=0;j<20;j++){
                if(z.equals(General[i][j])){
                    if(Reserva[i][j]==null){
                        Reserva[i][j]="Reservado";
                    }
                    else{
                        System.out.println(Reserva[i][j]);
                    }
                }
            }
        }        
    return Reserva;
    }
    public static String[][] reservarb(){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int r=0;
        String Reservap[][]=new String[3][20];
        if(r==0){
            String Preferencial[][]={{"I01","I02","I03","I04","I05","I06","I07","I08","I09","I10","I11","I12","I13","I14","I15","I16","I17","I18","I19","I20"},
                                    {"J01","J02","J03","J04","J05","J06","J07","J08","J09","J10","J11","J12","J13","J14","J15","J16","J17","J18","J19","J20"},
                                    {"K01","K02","K03","K04","K05","K06","K07","K08","K09","K10","K11","K12","K13","K14","K15","K16","K17","K18","K19","K20"}};
            String y;
            System.out.println("--------------------------");
            System.out.println("Seleccionar No Silla");
            System.out.println("--------------------------");
            y=lectura.next();
            for(int i=0;i<3;i++){
                for(int j=0;j<20;j++){
                    if(y.equals(Preferencial[i][j])){
                        Reservap[i][j]="Reservado";
                    }
                }
            }
        }
        return Reservap;
    }
}    
        //String estadosilla[][]= new String[8][20];
        //String estadosillap[][]=new String[3][20];
        //int x=1;
        //String a;
        //String b;
        //int c=1;
        //while(x != 0){
            //boolean Clasesilla=false;
            //System.out.println("Tiene tarjeta TORCINE y/n");
            //b=lectura.nextLine();
            //while(b.equals("y")){
              //  System.out.println("1 Reservar");
                //c=lectura.nextInt();
                //switch(c){
                  //  case 1:{
                        
                    //    System.out.println("Silla General o Preferencial");
                      //  a=lectura.nextLine();
                        //if(a.equals("Preferencial")){
                          //  Clasesilla=true;
                        //}
                   // Buscarsilla(Clasesilla,estadosilla);
                    //Buscarsillap(Clasesilla,estadosillap);
                    //}
                //}
            //}
        //}
    //}
    
    //
       // 
        //
        //String Silla;
        //if(a==false){
          //  System.out.println("Que silla desea");
            //Silla=lectura.nextLine();
            //
                //    if (Silla.equals(General[i][j])){
                  //      System.out.println(entrada[i][j]);
                    //    System.out.println("Desea Comprar o Reservar la Voleta");
                      //  System.out.println("Si desea Comprar Marque 1");
                        //System.out.println("Si desea Reservar Marque 2");
                        //System.out.println("Si esta Ocupada Marque 0");
                        //int x;
                       // x = lectura.nextInt();
                        //switch(x){
                          //  case 0:{
                            //    System.out.println("Silla Ocupada. Escoja Otra");
                            //}
                            //case 1:{
                              //  entrada[i][j]="Comprado";
                                //break;
                            //}
                            //case 2:{
                              //  entrada[i][j]="Reservado";
                                //break;
                            //}
                            //default:{
                              //  System.out.println("Comando Erroneo");
                            //}
                        //}                        
                    //}
                //}
            //}
        //}
        
        //return entrada;
       
    //}
    //pu/blic static String [][] Buscarsillap (boolean a,String entrada2 [][]){
      //  java.util.Scanner lectura = new java.util.Scanner(System.in);
        ////String Silla;
        //if(a==true){
          //  System.out.println("Que silla desea");
            //Silla=lectura.nextLine();
           // for(int i=0;i<3;i++){
             //   for(int j=0;j<20;j++){
               //     if (Silla.equals(Preferencial[i][j])){
                 //       System.out.println(entrada2[i][j]);
                   //     System.out.println("Desea Comprar o Reservar la Voleta");
                     //   System.out.println("Si desea Comprar Marque 1");
                       // System.out.println("Si desea Reservar Marque 2");
                        //System.out.println("Si esta Ocupada Marque 0");
                        //int x;
                        //x = lectura.nextInt();
                        //switch(x){
                          //  case 0:{
                            //    System.out.println("Silla Ocupada. Escoja Otra");
                            //}
                            //case 1:{
                              //  entrada2[i][j]="Comprado";
                                //break;
                            //}
                            //case 2:{
                              //  entrada2[i][j]="Reservado";
                                //break;
                            //}
                            //default:{
                              //  System.out.println("Comando Erroneo");
                            //}
                        //}                        
                    //}
                //}
            //}
        //}
        
      //  return entrada2;
       
    //}
//}