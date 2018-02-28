// José Gustavo Cabral Mello

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaVeiculo {

    public static void main(String arg[]) {

        BufferedReader memoria = new BufferedReader(new InputStreamReader(System.in));
        String menu = "";
        int n = 0;
        boolean numero = true;
        while (numero) {

            System.out.println("1)_Cadastrar Veículo de Passeio");
            System.out.println("2)_Cadastrar Veículo de Carga");
            System.out.println("3)_Imprimir Todos os Veículos de Passeio");
            System.out.println("4)_Imprimir Todos os Veículos de Carga");
            System.out.println("5)_Imprimir Veículo de Passeio pela placa");
            System.out.println("6)_Imprimir Veículo de Carga pela placa");
            System.out.println("7)_Aterar dados do Veículo de Passeio");
            System.out.println("8)_Aterar dados do Veículo de Carga");
            System.out.println("9)_Sair do sistema\n\n");

            try {
                menu = memoria.readLine();
                n = Integer.parseInt(menu);
                numero = false;
            } catch (IOException erro1) {
                System.err.println("\n Entre com um número de 1 à 9: "+erro1);
            } catch (NumberFormatException erro2){
                System.out.println("\n Entre com um número de 1 à 9: "+erro2);
            }

            if (n == 9) {
                System.out.println("9)_Sair do sistema\n\n");
                return;
            } else {
                System.out.println("/n Deu ruim!!!");
            }
        }
    }

}
