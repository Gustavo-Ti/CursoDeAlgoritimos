{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade, pares;

        System.out.print("quantos numeros vc vai digitar ? ");
        quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0 ;i < numeros.length; i ++){
            System.out.print("Digite um numero:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros pares:");
        pares = 0;
        for (int i = 0; i < numeros.length; i ++){
            if (numeros[i] % 2 == 0){
                 pares ++;
                System.out.println(numeros[i]);
            }
        }

        System.out.println("quantidades de pares: "+ pares);

        sc.close();
    }
}
