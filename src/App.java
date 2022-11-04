public class App {
    public static void main(String[] args) throws Exception {
        Profissional profissional = new Profissional();
        profissional.Nome = "Gilberto";
        profissional.SalarioMensal = 1800.00;

        System.out.println("Nome: " + profissional.Nome);
        System.out.println("Salário Mensal Pretendido: " + profissional.SalarioMensal);
        System.out.println("Horas Mês: " + profissional.horasUteisMes);
        
        System.out.println("Valor/Hora: " + profissional.CalculaValorHora());
    }
}
