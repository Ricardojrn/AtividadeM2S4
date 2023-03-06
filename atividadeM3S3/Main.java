package atividadeM3S3;
/**
 *
 * @author Ricardo
 */
public class Main {
    
    public static void main (String args[]){
        
        Figura retangulo1 = new Retangulo(5, 2, "Branco");
        System.out.println("Área do Retângulo "+retangulo1.getCor()+" é : " + retangulo1.area());
        
        Figura quadrado1 = new Quadrado(4, "Azul");
        System.out.println("Área do Quadrado "+quadrado1.getCor()+" é : " + quadrado1.area());
        
        Figura triangulo1 = new Triangulo(4, 10, "Verde");
        System.out.println("Área do Triangulo "+triangulo1.getCor()+" é : " + triangulo1.area());
        
        Circulo circulo1 = new Circulo(6, "Rosa");
        System.out.println("Área do Circulo "+circulo1.getCor()+" é : " + circulo1.area());
    }
}
