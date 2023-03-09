public class MultipleTicoTeco {
    public static void ticoTeco(int i) {
        if((i % 3 == 0) && (i % 5 ==0)) { //verifica se a divisão do numero por 3 é por 5 é 0, se for é multiplo tanto de 3 quanto 5
            System.out.println("TicoTeco");
        } else if(i % 3 == 0) { //verifica se a divisão do número por 3 é zero, se for o número é múltiplo de 3
            System.out.println("Tico");
        } else if(i % 5 == 0) { //verifica se a divisão do número por 5 é zero, se for o número é múltiplo de 5
            System.out.println("Teco");
        } else {
            System.out.printf("%d\n", i); //se nenhum dos casos acima for verdadeiro, ele retorna o número digitado
        }
    }
    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) { //anda pelo número 1 até o número 100
            ticoTeco(i); //e chama a função ticoTeco
        }
    }

}
