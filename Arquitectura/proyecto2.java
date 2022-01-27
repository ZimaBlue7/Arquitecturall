
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
        float dineroAcumulado = 0f;
        int numeroMaxAsistentes = 50 * 48712; // 2435600
        int conteoAsistentes = 0;
        int temporada = 0;
        int max = 22496722;
        /*
         * while (conteoAsistentes <= numeroMaxAsistentes) {
         * conteoAsistentes++;
         * dineroAcumulado += pagoxingreso;
         * }
         * 
         * System.out.println("Girar cheque por: " + dineroAcumulado);
         * System.out.println("El pago que debería haber sido: " + numeroMaxAsistentes *
         * pagoxingreso);
         */

        // segunda parte del ejercicio
        while (conteoAsistentes <= max) {
            conteoAsistentes++;
            dineroAcumulado = dineroAcumulado + pagoxingreso;
            if (conteoAsistentes >= 22494000) {

                System.out.println("Numero maximo de asistentes: " + conteoAsistentes);

                float tempo = conteoAsistentes / numeroMaxAsistentes;

                System.out.println("Temporada: " + tempo);
                float f = dineroAcumulado;
                f = (float) (Math.floor(f * 100) / 100);

                System.out.println(f);
                System.out.println("Dinero Acumulado: " + f);

            }

        }
    }
}