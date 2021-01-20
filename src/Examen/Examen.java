package Examen;

public class Examen {

    public String multiplo ( int x ){

        String f = "Face" ;
        String b = "Book";

        if (x % 15 == 0){ 
        
        return f.concat(b); } 
        
        else if (x % 5 == 0 ) {
        
            return b ; 
          } else if (x % 3 == 0 ){
             
              return f ;
          }
          else {
          String n = " No es multiplo de ningun numero" ;
          return n ;}

        }

    public String frases (int [] valores){
        String s="";
        for (int i = 0; i<3; i ++) {
            if (valores[i] % 15 == 0){
            String resultado =" Facebook ";
            return resultado;
        }
         if ( valores[i] % 5 == 0){
            String resultado1 = "Book";
            return resultado1;
        }

        if( valores[i] % 3 == 0){
            String resultado2 = "Book";
            return resultado2;
    }
    
}
return s;
}
}
