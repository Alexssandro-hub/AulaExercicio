package aulaexercicio;

/**
 *
 * @author Alexssandro
 */
public class AulaExercicio {

    public static void main(String[] args) {
        
        Pessoa[] p= new Pessoa[2];
        Livro[] l= new Livro[3];
        
        
        p[0]= new Pessoa ( " Alexssandro ", 20, " masculino ");
        p[1]= new Pessoa ( " trueShadow ", 20, " feminino ");
        
        
        l[0]= new Livro (" Aprendendo Java ", " Desconhecido ", 300, p[0] );     
        l[1]= new Livro (" Aprendendo Python ", " Desconhecido ", 300, p[1] );
        l[2]= new Livro (" Aprendendo POO ", " Desconhecido ", 300, p[0] );
    
        
        l[0].abrir();
        l[0].folhear(200);
        l[1].abrir();
        l[1].folhear(200);
        l[2].abrir();
        l[2].folhear(200);
    
        System.out.println(l[0].detalhes());
        System.out.println("\n" + l[1].detalhes());
        System.out.println("\n" + l[2].detalhes());
    
    }
    
}