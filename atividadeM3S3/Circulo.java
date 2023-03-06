package atividadeM3S3;
/**
 *
 * @author Ricardo
 */
public class Circulo extends Figura{
    private double raio;
    
    public Circulo(double raio, String cor){
        this.raio = raio;
        super.setCor(cor);
    }
    
    @Override
    public double area(){
        return 3.14*(raio*raio);
    }
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
}
