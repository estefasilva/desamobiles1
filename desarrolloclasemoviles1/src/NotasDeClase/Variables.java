package NotasDeClase;

public class Variables {
    public static void main(String[] args) {
        //tipo de datos : string, float, char, byte, boolean, int, dounle
        //variables se declaran y se inicializan
        String nombre;// declarar variable
        nombre = "Pepito";//inicializar una variable
        int id = 100125883; // vaiable declarada e inicializada
        //Scope o ambito de las variables corresponde a si esta puede ser alcanzada por
        //todas la estructuras que componene la clase o si solo funciona para un
        String global = "Soy global";
        if (global.equals("Soy global") ){
            System.out.println("Es una variable global");
            String local = "pero yo no";
        }else{
            System.out.println("No es global");
        }
        System.out.println(global);
// la variable del mismo tipo se pueden castear sin peridad de informacion
        //las que son de distinta tipo hay perdida de info

        byte numByte= 120;
        short numShort = (short) numByte;
        System.out.println(numShort);
        //parseo se da entre String y datos numericos
        String numDouble = "4.56";
        double numDecimal = Double.parseDouble(numDouble);
        System.out.println(numDecimal);
        double suma = numDecimal + 4.23;
    }
}
