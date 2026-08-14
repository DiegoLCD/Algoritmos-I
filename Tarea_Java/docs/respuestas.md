# **Respuestas de ejercicios**

### 1) Defina los conceptos de: 

**a)** Clase:  
    Molde o plano de fabricacion de los objetos.  
  
**b)** Objeto:  
    elemento de software que tiene estados y comportamientos, se usan para modelar objetos reales.  
  
**c)** Atributo: 
    Estado en el que se encuentra el objeto ya sea o no modificado por otros metodos  
*Metodo:*  
    Acciones que pueden cambiar los atributos de un objeto.
  
**d)** Sobrecarga:  
    Metodos con mismo nombre pero diferentes argumentos.  
  
**e)** Sobreescritura:  
    Redefine la implementación de un método heredado de la superclase para adaptar su comportamiento en la subclase.  
  
**f)** Jerarquía de clases:  
    Ocurre cuando una clase hereda atributos o metodos de ortra clase, a la clase que hereda se le dice subclass y a la clase de donde salen los atributos y metodos se le dice superclass
  
**g)** Herencia:  
    Es la capacidad que tiene las Subclass de heredar métodos o atributos de la Sumperclass

**h)** Polimorfismo:  
    El polimorfismo es la capacidad de tratar a diferentes objetos de clases hijas como si fueran del tipo de la clase padre, permitiendo que un mismo mensaje o llamada a un método ejecute comportamientos distintos según el objeto real en memoria.  

**i)** Binding: 
    El Binding (o ligadura / enlazamiento) es el proceso mediante el cual el compilador o el entorno de ejecución vincula una llamada a un método con la implementación concreta de ese método que se va a ejecutar.  
    no entendi del todo.

**j)** Características y ventajas de:  
- Abstracción  
    * La Abstracción se caracteriza por la capacidad de modelar objetos de la vida real y llevarlo al lenguaje de software.  
    * Ventajas: Al abstraer un objeto, solo tomamos lo que nos interesa del objeto lo que nos permite poner el foco únicamente en esas carácterísticas.  

- Encapsulamiento  
    * El encapsulamiento se caracteriza por ordenar, agrupar y proteger los atributos y métodos de una clase.  
    * Ventajas: Proteger la información de las clases y que solo se pueda acceder con getters y setters, dejando intacto los atributos y metodos de las superclases y asi poder evitar cambios en estas clases que pueden destruir otras partes del código.  

- Modularidad  
    * La modularidad se caracteriza por dividir de forma coherente cada parte del proyecto de forma que los pequeños módulos estén aislados, sean independientes, tengan cohesión y permitan mostrar solo lo necesario cuando se los llama.  
    * Ventajas: Fácil de mantener, depurar y debuggear. Permite trabajar en grandes equipos donde cada uno tiene uno o mas módulos para hacer o trabajar lo que lo hace mucho mas ordenado.

## Introduccion a Java:

### 11) Que sucede cuando se aplica f.init(80)  
Rta: Se le asigna el valor de 80 a longreg  

### 12) Indicar salida del programa
Rta: (x=25, y=25)  
Por que?: Resulta que el codigo tiene 2 constructores para Punto, uno que recibe solo 1 valor `Punto(int z)` y uno que  
recibe 2 valores `Punto(int a, int b)` . La diferencia es que el constructor que recibe 1 solo valor, a traves del `this`asigna  
a las 2 variables el mismo valor, mientras que el otro constructor las asigna por separado. Cuando el Main crea al punto en `Punto p = new punto(25)` entra por el constructor que recibe un solo valor y se lo asigna a ambas variables. Por lo tanto, la salida deberia ser (x=25, y=25)  

### 13) Cual es el cosntructor que se invoca?  
Rta: invoca al primer constructor, el que asigna num=0

### 14) Cual metodo invoca cada llamado?
Rta: `f(72.25)` esta queriendo meter un float, por lo que Java va a ir constructor por constructor hasta encontrar uno que admita floats, en este caso `f(double d)`  
para `f(0)` utilizara `f(int i)`  
para `f('z')` utilizara `f(char c)`  

###
