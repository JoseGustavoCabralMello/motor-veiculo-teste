// José Gustavo Cabral Mello

final public class Carga extends Veiculo implements Calc{
    private int tara;
    private int cargaMax;

    public Carga() {
        this.tara = 0;
        this.cargaMax = 0;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    } 
    
    public void calcular(){
        
    }
    
}
