package atividadeM3S3;
/**
 *
 * @author Ricardo
 */
public abstract class Figura {
    private String cor;
    
    public String getCor(){
        return cor;
    }    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public abstract double area();
}
