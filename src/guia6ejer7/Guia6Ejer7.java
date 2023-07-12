/*
Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la
excepción MioException?

class B{
public void metodoB(){
	sentencia_b1
try{
	sentencia_b2
}catch(MioException e){
	sentencia_b3
}
finally{
	sentencia_b4
}
}

a) Si se produce la excepción MioException, se ejecutan las siguientes sentencias en orden:

1. sentencia_b1: Esta sentencia se ejecuta antes de la estructura de control try-catch-finally.
2. sentencia_b2: Esta sentencia se encuentra dentro del bloque try y se ejecuta hasta que se produce la excepción MioException.
3. sentencia_b3: Esta sentencia se encuentra dentro del bloque catch y se ejecuta cuando se captura la excepción MioException.
4. sentencia_b4: Esta sentencia se encuentra dentro del bloque finally y se ejecuta después de la ejecución del bloque try-catch, independientemente de si se produjo o no la excepción MioException.

b) Si no se produce la excepción MioException, se ejecutan las siguientes sentencias en orden:

1. sentencia_b1: Esta sentencia se ejecuta antes de la estructura de control try-catch-finally.
2. sentencia_b2: Esta sentencia se encuentra dentro del bloque try y se ejecuta sin interrupción.
3. sentencia_b4: Esta sentencia se encuentra dentro del bloque finally y se ejecuta después de la ejecución del bloque try, sin tener en cuenta si se produjo o no la excepción MioException.
 */
package guia6ejer7;


public class Guia6Ejer7 {
 public static void main(String[] args) {
        B b = new B();

        try {
            b.metodoB();
        } catch (MioException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
   
