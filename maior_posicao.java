{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade, maior, posicao = 0;

        System.out.print("Quantos numeros vc vai digitar ? ");
        quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i ++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        maior = 0;
        posicao = 0;
        for (int i = 0; i < numeros.length; i ++){
            if(numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor: "+ maior);
        System.out.println("Posição do maior valor: "+ posicao);

        sc.close();
    }
}
