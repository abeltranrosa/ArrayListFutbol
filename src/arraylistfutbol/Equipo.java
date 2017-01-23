

package arraylistfutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Equipo {
    
    private  ArrayList<xogador> lEquipo ;
    
    
    public Equipo(){
        lEquipo =new ArrayList< xogador> ();
    }
    public void cargarLista(){
      xogador xog = new xogador(pedirNome(),pedirDorsal());  
      lEquipo.add(xog);
        
    }
    public String pedirNome(){
        return (JOptionPane.showInputDialog("nome :") );
    }
    public int pedirDorsal(){
        return (Integer.parseInt( JOptionPane.showInputDialog(" dorsal :")));
    }
    
    public void amosar(){
        Iterator<xogador> it =lEquipo.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }   
            
       }
    public void ordenar1(){
        Collections.sort(lEquipo);
    }
    
  
    }


