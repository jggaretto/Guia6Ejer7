
package guia6ejer7;
class B {
    public void metodoB() throws MioException {
        System.out.println("sentencia_b1");

        try {
            System.out.println("sentencia_b2");
            throw new MioException("Mensaje adicional de la excepción");
        } catch (MioException e) {
            System.out.println("sentencia_b3");
            System.out.println("Mensaje adicional: " + e.getMensajeAdicional());
        } finally {
            System.out.println("sentencia_b4");
        }
    }
}

