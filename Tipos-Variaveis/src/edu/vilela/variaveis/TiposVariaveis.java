package edu.vilela.variaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Vilela! Seja muito Bem-Vinda!");

        /*
         * OS 8 TIPOS PRIMITIVOS EM JAVA
         *  - int, byte, short, float, long, double e char : são considerados objetos. Portanto representam valores brutos. São armzenados diretamente na pilha de memória. 
         */

         /*double salarioMinimo = 2500;

         // PECULIARIDADES

         byte idade = 123;
         short ano = 2021;
         int cep = 26050195;
         long cpf = 19019552734L;
         float pi = 3.14F;
         double salario = 1275.33; */

        // CONSTANTES E VARIAVEIS 

        /*
         *  - CONSTANTES: não podem ser modificadas. 
         * sua convenção se da pela paçavra "FINAL" ou  suas variáveis escritas em "CAIXA ALTA"
         * 
         * - VARIÁVEIS COMUNS: podem ser modificadas.  
         */
 
        int numero = 5;
        numero = 10; // foi possivel modificar
        System.out.println(numero);

        final int VALOR_PI = 2000;
       // VALOR_PI = 1; // não muda
        System.out.println(VALOR_PI);

        // OPERADORES 

        /*
         *  - Aritméticos: (+) adição, (-) subtração, (*) multipricação, (/) divisão e (%) resto ou modulo. 
         * 
         *  - Unários: Realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos. (++), (--), (+), (-) e (! - negação)
         * 
         *  - Relacionais: (==) igual a, (!=) diferernte de, (><) maior menor q, (>=) maior ou igual, (<=) menor igual q, etc.... 
         * 
         *  - Lógicos: && Lógico "E" , || Lógico "OU"
         * 
         *  - Ternários: Igual a condição if, porem estruturada em uma unica linha representados pelos simbolos ?: utiliza-se da seguinte forma: < Expressão condicional > ? < Caso condilçao true > : < Caso condição false >
         * 
         *  - Atribuição: (=) defini valor inicial ou sobrescreve  o valor de uma variavel.
         * 
         *  
         *  OBS: O OPERADOR (+), QUANDO UTILIZADO EM VARIAVEIS DE TIPO TEXTO, REALIZARA A CONCATENAÇÃO DE TEXTOS. 
         */

    }
}
