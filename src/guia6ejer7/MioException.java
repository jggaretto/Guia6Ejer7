
package guia6ejer7;

class MioException extends Exception {
    private String mensajeAdicional;
    
    public MioException(String mensaje) {
        super("Excepción personalizada MioException");
        mensajeAdicional = mensaje;
    }
    
    public String getMensajeAdicional() {
        return mensajeAdicional;
    }
    
    // Puedes agregar más métodos y funcionalidad según tus necesidades
}