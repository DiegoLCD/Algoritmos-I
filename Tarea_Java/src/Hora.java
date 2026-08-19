/*
+---------------------------+
|          Hora             |
+---------------------------+
| - Horas : int             |   <-- Atributos.
| - Minutos : int           |
| - Segundos : int          |
+---------------------------+
| + Hora() :                |   <-- Constructor por default.
| + Hora(H,M,S) :           |   <-- Constructor con valores dados.
| + visualizar() : String   |   <-- Metodo Getter que muestra la hora.
| + sumar(H1, H2) : int     |   <-- Metodo Setter que crea la suma de 2 horas 

*/

public class Hora {

    private int hh;
    private int mm; 
    private int ss;
    
    public Hora() {
        this.hh = 00;
        this.mm = 00;
        this.ss = 00;
    }

    public Hora(int a, int b, int c) {
        this.hh = a;
        this.mm = b;
        this.ss = c;
    }

    public static Hora sumarHoras(Hora hora1, Hora hora2) {
        int sumarSegundos = hora1.ss + hora2.ss;
        int sumarMinutos = hora1.mm + hora2.mm;
        int sumarHoras = hora1.hh + hora2.hh;

        return new Hora(sumarHoras,sumarMinutos,sumarSegundos);
    }

    @Override
    public String toString() {
            return String.format("Hora:%02d:%02d:%02d", this.hh, this.mm, this.ss );
        }
}