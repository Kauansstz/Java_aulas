public class Data {
    int dia;
    int mes;
    int ano;

    String obterInfoDate() {
        // Corrigindo a formatação
        return String.format("%d/%d/%d\n", dia, mes, ano);
    }

    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 30;
        d1.mes = 6;
        d1.ano = 2025;

        System.out.println(d1.obterInfoDate());
    }
}
