// Nome: Saymon Augusto Passos Neiva 
// RA: 323523900

public class ArattaiGrowthTracker{
  public static void main (String[] args){
  int [] downloadsDiarios = {850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000};
  String [] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};

  int totalDownloads = 0;

  for(int i = 0; i < downloadsDiarios.length; i++){
    totalDownloads += downloadsDiarios[i];
  }

System.out.println(" Análise de Crescimento do Arattai (7 dias) ");
System.out.printf("\n[R2] Total de Downloads na Semana: %,d\n", totalDownloads);

int pico = downloadsDiarios[0];
int minimo = downloadsDiarios[0];
String diaPico = diasDaSemana[0];
String diaMinimo = diasDaSemana[0];

for (int i = 1; i < downloadsDiarios.length; i++){
    if (downloadsDiarios[i] > pico) {
        pico = downloadsDiarios[i];
        diaPico = diasDaSemana[i];
    }
    if (downloadsDiarios[i] < minimo){
        minimo = downloadsDiarios[i];
        diaMinimo = diasDaSemana[i];
    }
}

System.out.println("\n[R3] Análise de Extremos: ");
System.out.printf("Dia de pico de Downloads: %s com %,d downloads. \n", diaPico, pico);
System.out.printf("Dia de Mínimo de Downloads: %s com %,d downloads. \n", diaMinimo, minimo);

int metaDiaria = 1000000;
int diasAcimaDaMeta = 0;

System.out.printf("\n[R4] Análise de Metas (Meta Diária: 1000000): \n", metaDiaria);
for (int i = 0; i < downloadsDiarios.length; i++){
    int valor = downloadsDiarios[i];
    String dia = diasDaSemana[i];

    if (valor > metaDiaria) {
                System.out.printf(" %s: SUCESSO! (%,d downloads)\n", dia, valor);
                diasAcimaDaMeta++;
            } else if (valor == metaDiaria) {
                System.out.printf(" %s: Não atingiu. (%,d downloads)\n", dia, valor);
            } else {
                System.out.printf(" %s: Não atingiu. (%,d downloads)\n", dia, valor);
            }
        }

        System.out.printf("\n[Relatório Final] O Arattai superou a meta diária em %d dias esta semana.\n", diasAcimaDaMeta);
        
    }
}
  
