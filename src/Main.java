import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Automaat automaat = new Automaat();
        BankPas bp = new BankPas();

        System.out.println("--- Welkom bij het OV-Systeem ---");
        System.out.print("Wat is uw naam? ");
        Reiziger reiziger = new Reiziger(input.nextLine());

        reiziger.setKaart(automaat.nummerGenereren());
        System.out.println("Hallo " + reiziger.getNaam() + ", uw nieuwe kaart " + reiziger.getKaart().getKaartNummer()
                + " is klaar.");

        boolean doorgaan = true;
        while (doorgaan) {
            System.out.println("\n--- MENU ---");
            System.out.println("Saldo: €" + reiziger.getKaart().getSaldo());
            System.out.println("Status: " + (reiziger.getKaart().getIsIngecheckt() ? "Ingecheckt" : "Niet ingecheckt"));
            System.out.println("1. Saldo opladen\n2. Inchecken\n3. Uitchecken\n4. Reisgeschiedenis tonen\n5. Stoppen");
            System.out.print("Keuze: ");

            int keuze = input.nextInt();
            switch (keuze) {
                case 1:
                    System.out.print("Bedrag: ");
                    reiziger.getKaart().laadOp(input.nextDouble(), bp);

                    System.out.println(bp.getBankSaldo());
                    break;
                case 2:
                    reiziger.getKaart().checkIn(automaat.kiesStation("inchecken"));
                    break;
                case 3:
                    reiziger.getKaart().checkUit(automaat.kiesStation("uitchecken"));
                    break;
                case 4:
                    reiziger.getKaart().toonGeschiedenis();
                    break;
                case 5:
                    doorgaan = false;
                    break;
                default:
                    System.out.println("Foute keuze!");
                    break;
            }
        }
        System.out.println("Fijne dag!");
    }
}