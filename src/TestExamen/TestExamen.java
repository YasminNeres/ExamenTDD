package TestExamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Examen.Examen;

public class TestExamen {
    @Test 
    @DisplayName("Parte1 - multiplo de 15")
    void multiploDe15(){
        // Primero paso - Preparacion del test
        Examen test = new Examen();

        // Segundo paso - Ejecucion
        String res = test.multiplo(15);

        // Tercero paso - Verificaciòn
        assertEquals("FaceBook", res);

    }

    @Test
    @DisplayName("Parte 1 - multiplo de 5")
    void multiploDe5(){
         // Primero paso - Preparacion del test
         Examen test = new Examen();

         // Segundo paso - Ejecucion
         String res = test.multiplo(5);

          // Tercero paso - Verificaciòn
        assertEquals("Book", res);

    }

    @Test
    @DisplayName("Parte 1 - multiplo de 3")
    void multiploDe3(){
         // Primero paso - Preparacion del test
         Examen test = new Examen();

         // Segundo paso - Ejecucion
         String res = test.multiplo(3);

          // Tercero paso - Verificaciòn
        assertEquals("Face", res);

    }

    @Test
    @DisplayName("Parte 2 - Array con valores 1,2,3")
    void valores1(){

        //Primero paso - Preparaciòn del test
        Examen examen = new Examen();
        // Segundo paso - Ejecuciòn
        String result = examen.frases();

        // Tercero paso - Verificaciòn
        assertEquals(" 1 2 Face", result);
    }

    @Test
    @DisplayName("Parte 2 - Array con valores 6,10,30")
    void valores2(){

        //Primero paso - Preparaciòn del test
        Examen examen = new Examen();
        // Segundo paso - Ejecuciòn
        String result = examen.frases();

        // Tercero paso - Verificaciòn
        assertEquals("Face , Book, Facebook", result);
    }

    @Test
    @DisplayName("Parte 2 - Array con valores 4,6,8")
    void valores3(){

        //Primero paso - Preparaciòn del test
        Examen examen = new Examen();
        // Segundo paso - Ejecuciòn
        String result = examen.frases();

        // Tercero paso - Verificaciòn
        assertEquals("4,6,8", result);
    }

    
}
