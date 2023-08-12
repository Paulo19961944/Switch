public class Switch {
    public static void main(String[] args) {
        String[] dias = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        {
            switch (dias) {
                case "Sun":
                    dias[0] = "domingo";
                    break;
                case "Mon":
                    dias[1] = "segunda-feira";
                    break;
                case "Tue":
                    dias[2] = "terça-feira";
                    break;
                case "Wed":
                    dias[3] = "quarta-feira";
                    break;
                case "Thu":
                    dias[4] = "quinta-feira";
                    break;
                case "Fri":
                    dias[5] = "sexta-feira";
                    break;
                case "Sat":
                    dias[6] = "sábado";
                    break;
                default:
                    break;
            }
            System.out.println(dias[0]);
            System.out.println(dias[1]);
            System.out.println(dias[2]);
            System.out.println(dias[3]);
            System.out.println(dias[4]);
            System.out.println(dias[5]);
            System.out.println(dias[6]);
        }
    }
}
