public class Main {

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

}