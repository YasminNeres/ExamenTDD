package Main;

import Examen.Examen;

public class app {
     public static void main(String[] args) throws Exception {
        System.out.println("Hola Santi");

        Examen ex = new Examen();
        System.out.println(" Si es multiplo de 3 tiene que devolver : " + ex.multiplo(9));
        System.out.println(" Si es multiplo de 5 tiene que devolver : " + ex.multiplo(10));
        System.out.println(" Si es multiplo de 15 tiene que devolver : " + ex.multiplo(30)); 
        System.out.println(" Si no es multiplo de ninguno tiene que devolver : " + ex.multiplo(37)); 
        

     }
}
