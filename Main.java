class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Main <num1> <num2> <operator>");
            System.exit(-1);
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            String operator = args[2];

            switch (operator) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "x":
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Erreur : Division par zéro");
                        System.exit(-1);
                    }
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Opérateur non reconnu. Utiliser +, -, *, / ou x");
                    System.exit(-1);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erreur : Les deux premiers arguments doivent être des entiers.");
            System.exit(-1);
        }
    }
}
