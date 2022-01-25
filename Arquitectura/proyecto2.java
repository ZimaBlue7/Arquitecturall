
/*
Fecha: 19/01/2022
Autores: Maria Camila Rodriguez, Juan David Olaya.
*/
public class proyecto2 {

    public static proyecto2 p2;

    public static void main(String args[]) {

        p2 = new proyecto2();
        p2.pago();
    }

    public void pago() {
        float pagoxingreso = 0.1718750f;
        float pagoTotal = 0;
        float capacidadEstadio = 48712;
        float dineroAcumulado = 0;
        int numeroMaxAsistentes = 50 * 48712; // 2435600
        int conteoAsitentes = 0;

        while (conteoAsitentes <= numeroMaxAsistentes) {
            conteoAsitentes++;
            dineroAcumulado += pagoxingreso;
        }
        System.out.println("Girar cheque por: " + dineroAcumulado);
        System.out.println("El pago que debería haber sido: " + numeroMaxAsistentes * pagoxingreso);
    }
}