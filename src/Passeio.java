// José Gustavo Cabral Mello

final public class Passeio extends Veiculo implements Calc{
    private int qtdePassaggeiros;
    
    public Passeio(){
        this.qtdePassaggeiros = 0;
    }

    public int getQtdePassaggeiros() {
        return qtdePassaggeiros;
    }

    public void setQtdePassaggeiros(int qtdePassaggeiros) {
        this.qtdePassaggeiros = qtdePassaggeiros;
    }
    
    public void calcular(){
        
    }
}
