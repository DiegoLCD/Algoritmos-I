/*
+-----------------------------+
|         Lamparita           |  <-- 1. Nombre de la Clase
+-----------------------------+
| - estadoEncendida : boolean |  <-- 2. Atributos (Características) El signo "-" significa "Private"
+-----------------------------+
| + lamparita()               |  <-- 3. Constructor, se ejecuta al hacer "new lamparita()"
| + encender() : void         |  <-- 4. Métodos (Acciones que puedo hacer sobre la lamparita)
| + apagar() : void           |      El signo "+" significa "Public"
| + mostrarEstado() : void    |
+-----------------------------+ 
*/

public class Lamparita {

    private boolean estadoEncendida;

    public Lamparita() {
        this.estadoEncendida = false;
    }

    public void encender() {
        this.estadoEncendida = true;
    }

    public void apagar() {
        this.estadoEncendida = false;
    }

    public void mostrarEstado() {
        if (this.estadoEncendida) {
            System.out.println("La lamparita esta encendida");
        }
        else {
            System.out.println("La lamparita esta apagada");
        }
    }

}
