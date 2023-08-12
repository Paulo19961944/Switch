public class Switch {
    public static void main(String[] args) {
        /** Variáveis */
        String[] dias = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        /** Lista de Números */
        int[] numeros = {0, 1, 2, 3, 4, 5, 6};

        /** Switch Case */
        for (int i = 0; i < numeros.length; i++) {
            switch (numeros[i]) {
                case 0:
                    dias[0] = "Domingo";
                    System.out.println("Dia " +": " + dias[0]);
                    break;
                case 1:
                    dias[1] = "Segunda-Feira";
                    System.out.println("Dia " + ": " + dias[1]);
                    break;
                case 2:
                    dias[2] = "Terca-Feira";
                    System.out.println("Dia " + ": " + dias[2]);
                    break;
                case 3:
                    dias[3] = "Quarta-Feira";
                    System.out.println("Dia " + ": " + dias[3]);
                    break;
                case 4:
                    dias[4] = "Quinta-Feira";
                    System.out.println("Dia " + ": " + dias[4]);
                    break;
                case 5:
                    dias[5] = "Sexta-Feira";
                    System.out.println("Dia "+ ": " + dias[5]);
                    break;
                case 6:
                    dias[6] = "Sabado";
                    System.out.println("Dia " + ": " + dias[6]);
                    break;
                default:
                    System.out.println("Dia inválido");
                    break;
            }
        }
    }
}
