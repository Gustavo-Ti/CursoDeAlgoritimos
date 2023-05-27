{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qantidades de numero que voce vai digitar: ");
        int num = sc.nextInt();

        double[] vect = new double[num];

        for (int i = 0; i < vect.length; i++){
            System.out.println("digite o numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("valores: ");

        double soma = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
            soma += vect[i];
        }
        double media = soma/ vect.length;

        System.out.println("Soma: "+ soma);
        System.out.println("Media: "+ media);
    }
}
