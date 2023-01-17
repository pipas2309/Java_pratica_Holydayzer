import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\nColoque a data que você quer consultar\nse ela é ou não um feriado!");
        System.out.println("Use o formato: DD/MM/AAAA,\npor exemplo: \"01/11/2000\"");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        DateValidator validator = new DateTester("dd/MM/yyyy");      

        if(!validator.isValid(date)) { 
            scanner.close();
            System.out.println("\nComplexo...");
            System.out.println("Para saber se existe um feriádo,\nprimeiro precisa de uma data...");
            System.out.println("Se nem isso você sabe, o feriádo\nnão faz diferença na sua vida!");
            System.out.println("\nSaD n4RuTO sONg");
            return;
        }

        Holidays holidays = new Holidays();
        
        if(date.charAt(4) == '8') {
            System.out.println("\nAmigo, é Agosto...\nTrabalha, chora, dorme, repete!");
        } else if(holidays.getHoliday(date) == null) {
            System.out.println("\nVai ter que ir trabalhar, sem feriado!");
        } else {
            System.out.println("\nNo dia: " + date + " será feriado de " + holidays.getHoliday(date) + "!");
        }

        System.out.println("\n----------");
        System.out.println("\nQuer a lista de todos os feriados?");
        scanner = new Scanner(System.in);
        String question = scanner.nextLine();


        if(question.equals("sim")) {
            holidays.getAllHolidays().forEach(
                holiDate -> System.out.println("Dia " + holiDate + " é feriado de " + holidays.getHoliday(holiDate) + "!")
            );
        } else if(question.equals("nao") || question.equals("n") || question.equals("não") ) {
            System.out.println("Ok!\n");
        } else {
            System.out.print("Vou considerar isso um não!\n");
        }
        scanner.close();
    }
}
