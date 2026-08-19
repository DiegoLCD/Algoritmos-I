public class Main {

    /*
    public static void main(String[] args) {

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
   public static void main(String[] args) {

    Hora miHora1 = new Hora(1,60,3);
    Hora miHora2 = new Hora(2,7,3);
    Hora horaSumada = Hora.sumarHoras(miHora1, miHora2);

    System.out.println(miHora1);
    System.out.println(miHora2);
    System.out.println(horaSumada);

   }
}