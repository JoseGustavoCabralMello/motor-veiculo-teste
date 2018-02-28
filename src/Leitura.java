//Jose Gustavo Cabral Mello

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Leitura {
   public String entraDados (String dados){
       InputStreamReader teclado = new InputStreamReader(System.in);
       BufferedReader memoria = new BufferedReader(teclado);
       System.out.print(dados);
       
       return dados;
   }
}
