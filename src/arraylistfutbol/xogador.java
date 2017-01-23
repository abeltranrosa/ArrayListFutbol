

package arraylistfutbol;

import java.util.Objects;

public class xogador implements Comparable{
     
    private String nome;
    private int dorsal;
    
public xogador(){    
    
} 

    public xogador(String nome, int dorsal) {
        this.nome = nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "xogador{" + "nome=" + nome + ", dorsal=" + dorsal + '}';
    }

    public int compareTo(Object o){
        
         xogador xog = (xogador)o ;
         
         if(this.nome.compareToIgnoreCase(xog.nome)==0)
           return 0;
         else if(this.nome.compareToIgnoreCase(xog.nome)>0)
             return 1;
         else 
              return -1 ;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final xogador other = (xogador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
