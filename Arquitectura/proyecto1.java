
/*
Fecha: 19/01/2022
Autores: Maria Camila Rodriguez, Juan David Olaya.
*/

public class proyecto1 {

    public static proyecto1 p1;

    public static void main(String args[]) {

        p1 = new proyecto1();
        p1.recorrido();
    }

    public void recorrido() {
        float deltaTime = 0.093f;
        float time = 0.0f;
        float Vx = 92.25f; // velocidad de despegue
        float v = 0; // velox actual
        float a = 0.625f; // Aceleracion constante
        float x = 0.0f; // Distancia recorrida
        float xLimite = 6808.05f; // Distancia limite segura
        int i = 0;

        while (x <= xLimite) {
            time += deltaTime;
            v = (a * time);
            x = ((v * v)) / (2 * a);
            i++;
            System.out.println("Distancia recorrida: " + x + " Velocidad actual: " + v);
            if (v >= Vx) {
                System.out.println("Despegue");
                break;

            }
        }
    }

}