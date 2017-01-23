
package arraylistfutbol;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArraylistFutbol {

    public static void main(String[] args) {
       Equipo equi = new Equipo();
     
       int op;
       do{
     // facemos try--catch por se metemos algunha letra en vez de número
     try{      
      op = Integer.parseInt(JOptionPane.showInputDialog("*** MENU*** \n1 engadir xogador  \n2 amosar equipo  \n3  ordear  \n4 sair  "));
     }catch(Exception ex){
         System.out.println( ex.getMessage());
         op =0;
     }  
        
        switch(op){
            
            case 1: equi.cargarLista();
                    break;
            case 2: equi.amosar();
                    break;
            case 3: equi.ordenar1();
                    break;
            case 4: System.exit(0);
        }
    }while(op < 4);
       }  
}
