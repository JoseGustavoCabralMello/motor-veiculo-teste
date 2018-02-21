// José Gustavo Cabral Mello

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double velocMax;
    private Motor motor = new Motor();
    
    public Veiculo(){
        placa = " ";
        marca = " ";
        modelo = " ";
        velocMax = 0;                        
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setVelocMax(double velocMax){
        this.velocMax = velocMax;
    }
    
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public double getVelocMax(){
        return velocMax;
    }
    
    public Motor getMotor(){
        return motor;
    }
    
}