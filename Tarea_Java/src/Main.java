public class Main {


    public static void main(String[] args) {
/* 
        Lamparita miLamparita = new Lamparita();

        miLamparita.mostrarEstado();

        miLamparita.encender();

        miLamparita.mostrarEstado();

        miLamparita.apagar();

        miLamparita.mostrarEstado(); 


        Archivo f = new Archivo();
        f.init(80);

        f.estadoLongreg();
    }
*/

    Hora miHora1 = new Hora(20,58,55);
    Hora miHora2 = new Hora(5,7,30);
    Hora horaSumada = Hora.sumarHoras(miHora1, miHora2);

    System.out.println(miHora1);
    System.out.println(miHora2);
    System.out.println(horaSumada);


   }

}
