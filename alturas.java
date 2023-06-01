{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade, menores;
        double alturaMedia, alturaTotal, porcentagemMenores;

        System.out.println("Quantas pessoas serao digitadas ?");
        quantidade = sc.nextInt();

        String[] nome = new String[quantidade];
        int[] idade = new int[quantidade];
        double[] altura = new double[quantidade];

        for (int i = 0; i < quantidade; i ++){
            System.out.printf("Dados da %d pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.next();

            System.out.print("idade: ");
            idade[i] = sc.nextInt();

            System.out.print("altura: ");
            altura[i] = sc.nextDouble();
        }

        alturaTotal = 0;
        menores = 0;
        for (int i = 0; i < quantidade ; i ++){
            alturaTotal += altura[i];

            if (idade[i] < 16){
                menores ++;
            }
        }

        alturaMedia = alturaTotal / quantidade;
        porcentagemMenores = ((double)menores / quantidade) * 100;

        System.out.println("Altura media:"+ alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores);

        for (int i = 0; i < quantidade; i ++){
            if (idade[i] < 16){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
