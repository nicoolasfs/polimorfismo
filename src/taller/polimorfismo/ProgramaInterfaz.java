package taller.polimorfismo;

public class ProgramaInterfaz {
     public static void main(String[] args) {
       Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        
        Burro Rucio=new Burro();
        hacerCantar(Rucio);

    }
        public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 

}
