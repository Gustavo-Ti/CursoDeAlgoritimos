{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;

        System.out.println("Quantos valores vai ter cada vetor? ");
        quantidade = sc.nextInt();

        int[] vectA = new int[quantidade];
        int[] vectB = new int[quantidade];
        int[] vectC = new int[quantidade];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i <vectA.length; i ++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i <vectB.length; i ++){
            vectB[i] = sc.nextInt();
        }

        for (int i = 0; i <vectC.length; i ++){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Vetor Resultante:");
        for (int i = 0; i <vectC.length; i ++){
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
