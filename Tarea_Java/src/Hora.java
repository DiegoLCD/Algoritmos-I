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

    @Override
    public String toString() {
            return "Hora:"+ this.hh +":"+ this.mm +":"+ this.ss ;
        }
}
