public class Carro{

    private Double Combustivel;
    private String Modelo;

public Carro(String Combustivel, String Marca){
    //this.Combustivel = Combustivel;
    this.setCombustivel(Combustivel);
    //this.Marca = Marca;
    this.setModelo(Modelo);
}

public Carro(String string) {
}

public void setCombustivel(String C){
    Combustivel = Combustivel;
}

public Double getCombustivel(){
    return Combustivel;
}

public void setModelo (String marca){
    this.Modelo = Modelo;
}

public String getModelo(){
    return this.Modelo;
}

public void acelerandoCarro() {
   
    System.out.println("Acelerando....");
}

public void freiando() {
    System.out.println("Freiando....");
}

}