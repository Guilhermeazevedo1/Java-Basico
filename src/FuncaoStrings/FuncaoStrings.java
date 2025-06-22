package FuncaoStrings;

public class FuncaoStrings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG     ";

        //-------------------------- USADO PARA FORMATAÇÃO -----------------------------

        // o toLowerCase é usado para deixar toda string em letras minusculas
        String lowerCase = original.toLowerCase();

        // o toUpperCase é usado para dexiar toda string com letras maiusculas
        String upperCase = original.toUpperCase();

        // o trim é usado para tirar o espaçamento inicial e final se houver
        String trim = original.trim();

        //--------------------------------------------------------------------------------

        //-------------------------- USADO PARA RECORTAR -----------------------------

        // o subString é usado para mostrar somente o caracter da posição 2 em diante ou da posição a sua escolha
        String subString = original.substring(2);

        // o subString com 2 argumentos é usado para mostrar da posição a sua escolha e finalizar na posição a sua escolha
        String subStringArgs = original.substring(2, 3);

        //--------------------------------------------------------------------------------

        //-------------------------- USADO PARA SUBSTITUIR -----------------------------

        // o replace é usado para substituir o primeiro argumento por caracter desejado no segundo argumento, ele é case sensitive
        String replace = original.replace('a', 'x');

        // o replace pode ser usado para substituir texto no primeiro argumento por outro texto desejado no segundo argumento, ele é case sensitive
        String replace2 = original.replace("abc", "xy");

        //--------------------------------------------------------------------------------

        //-------------------------- USADO PARA BUSCAR -----------------------------

        //o indexOf serve para saber a primeira posição do index da String ou char que você colocou
        int indexOf = original.indexOf("b");

        //o lastIndexOf serve para saber a ultima posição do index da String ou char que você colocou
        int lastIndexOf = original.lastIndexOf("bc");

        //--------------------------------------------------------------------------------

        //-------------------------- USADO PARA DIVIDIR -----------------------------

        // o split é usado para dividir uma string em mais de uma usando vetor e algum separador a minha escolha
        String exemplo = "Batata, Maçã, Limão";

        String[] split = exemplo.split(", ");
        String palavra1 = split[0];
        String palavra2 = split[1];
        String palavra3 = split[2];

        //--------------------------------------------------------------------------------
    }
}
