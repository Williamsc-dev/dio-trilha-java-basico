public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;

        // String resultado = a == b ? "verdadeiro" : "falso";
        int resultado = a == b ? 1 : 0;

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");

            String nomeUm = "Williams";
            String nomeDois = "Willams";

            System.out.println(nomeUm == nomeDois);

            boolean condicao1 = true;

            boolean condicao2 = false;

            if (condicao1 || condicao2) {
                System.out.println("uma das condições é verdadeiras");
            }

        }

    }

}
