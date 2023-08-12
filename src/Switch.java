public class Switch {
    public static void main(String[] args) {
        /** Variáveis */
        String[] dias = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};

        /** Números de 0 a 6 */
        int[] numeros = {0, 1, 2, 3, 4, 5, 6};

        /** Switch Case */
        for (int i = 0; i < numeros.length; i++) {
            switch (numeros[i]) {
                case 0:
                    System.out.println("Dia " + numeros[i] + ": " + dias[i]);
                    break;
                case 1:
                    System.out.println("Dia " + numeros[i] + ": " + dias[i]);
                    break;
                case 2:
                    System.out.println("Dia " + numeros[i] + ": " + dias[i]);
                    break;
                case 3:
                    System.out.println("Dia " + numeros[i] + ": " + dias[i]);
                    break;
                case 4:
                    System.out.println("Dia " + numeros[i] + ": " + dias[i]);
                    break;
                case 5:
                    System.out.println("Dia " + numeros[i] + ": " + dias[i]);
                    break;
                case 6:
                    System.out.println("Dia " + numeros[i] + ": " + dias[i]);
                    break;
                default:
                    System.out.println("Dia inválido");
                    break;
            }
        }
    }
}
