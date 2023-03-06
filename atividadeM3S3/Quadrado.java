package atividadeM3S3;
/**
 *
 * @author Ricardo
 */
public class Quadrado extends Retangulo{
    public Quadrado (double lado1, String cor){
        super(lado1,cor);
    }
    
    @Override
    public double area(){
        return Math.pow(super.getLado1(), 2);
    }
}
