package arbolesbinarios;
import java.util.concurrent.TimeUnit;

public class Dinosaurio {
    public static void imprimirDinosaurio() throws InterruptedException {
        String head = " O ";
        String torso = "/ | \\";
        String dinosaurio = " / \\ ";
        String cuerpo = head + "\n" + torso + "\n" + dinosaurio;
        String suelo = "------------------------------------------------------";
        String s = cuerpo + "\n" + suelo;

        for (int i = 1; i <= 48; i++) {
            head = " " + head;
            torso = " " + torso;
            dinosaurio = " " + dinosaurio;
            cuerpo = " " + head + "\n" + torso + "\n" + dinosaurio;
            s = cuerpo + "\n" + suelo;

            if (i == 48) {
                System.out.println("\t" + "fin" + "\n" + suelo);
            } else {
                System.out.println(s + "\n \n");
            }

            TimeUnit.MILLISECONDS.sleep(20); // Tiempo de espera en milisegundos
        }
    }

    
}