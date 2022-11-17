public class App {
    public static void main(String[] args) throws Exception {
        Profissional profissional = new Profissional();
        profissional.Nome = "Gilberto";
        profissional.SalarioMensal = 1900.00;

        System.out.println("Nome: " + profissional.Nome);
        System.out.println("Salário Mensal Pretendido: " + profissional.SalarioMensal);
        System.out.println("Horas Mês: " + profissional.horasUteisMes);
        System.out.println("Valor/Hora: " + profissional.CalculaValorHora());

        // App que faz pesquisa sobre quem irá à final da Copa
        // Login (Front End + Back End + Banco de Dados)
        // Cadastro (Front End + Back End + Banco de Dados)
        // Pesquisa (Front End + Back End + Banco de Dados)
        // Saída com Filtro (Front End + Back End + Banco de Dados)

        // Login (Front End = 16 + Back End = 48 + Banco de Dados = 8) = 72 horas
        // Cadastro (Front End + Back End + Banco de Dados)  = 72 horas
        // Pesquisa (Front End + Back End + Banco de Dados) = 48 horas
        // Saída com Filtro (Front End + Back End + Banco de Dados) = 24 horas
        // Total = 216
        // Custo = 15.428,88
        // App Inventor
        // App Creator

        ItemSistema[] listaItenSistemas = new ItemSistema[4];

        ItemSistema tela1 = new ItemSistema();
        tela1.nomeItem = "Tela de Login";
        tela1.tipoItem = "Login";
        tela1.complexidade = 3;
        listaItenSistemas[0] = tela1;

        ItemSistema tela2 = new ItemSistema();
        tela2.nomeItem = "Tela de Cadastro";
        tela2.tipoItem = "Tela Normal";
        tela2.complexidade = 3;
        listaItenSistemas[1] = tela2;

        
        ItemSistema tela3 = new ItemSistema();
        tela3.nomeItem = "Tela de Pesquisa";
        tela3.tipoItem = "Tela Normal";
        tela3.complexidade = 2;
        listaItenSistemas[2] = tela3;

        ItemSistema tela4 = new ItemSistema();
        tela4.nomeItem = "Saída com Filtro";
        tela4.tipoItem = "Tela Saída";
        tela4.complexidade = 1;
        listaItenSistemas[3] = tela4;

        int totalHorasTelas = 0;
        int numeroTela = 1;

        for (ItemSistema itemSistema : listaItenSistemas) {
            totalHorasTelas = totalHorasTelas + itemSistema.CalcularQuantidadeHoras();

            System.out.println("Item " + numeroTela + " do orçamento: " + itemSistema.nomeItem);
            System.out.println("Tipo do Item: " + itemSistema.tipoItem);
            System.out.println("Complexidade do Item: " + itemSistema.complexidade);
            System.out.println("Quantidade de Horas Previstas: " + itemSistema.CalcularQuantidadeHoras());

            numeroTela = numeroTela + 1;

        }

        double valorTotalSistema = profissional.CalculaValorHora() * totalHorasTelas;

        System.out.println("Valor Total do Orçamento: " + valorTotalSistema);

    }
}
