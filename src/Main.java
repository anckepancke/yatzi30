import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

   public class Main {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);  // den tar in all
        System.out.println("how many players are playing");


        int players = tgb.nextInt();

        String[] playernames = new String[players];

        for (int i = 0; i < players; i++) {

            playernames [i] = tgb.next();

            String[] Playerslist = Arrays.copyOfRange(playernames,0,players);
            String playernameStr = Arrays.toString(playernames);
            System.out.println(playernameStr);
        }


        int[] dices = rollDices(6);

        for (int i = 0; i < dices.length; i++) {
            System.out.println(dices[i]);
        }
        try
        {
            System.out.println("pick how many to save");    int savednumber = tgb.nextInt(); // hur många man sparar
        }
        catch (Exception e)  // gör så koden inte krashar när man skriver en bokstav
        {
            tgb.next();
            System.out.println("Noob");
        }

    }
    public static int[] rollDices(int diceCnt) {
        int savedDie = 0;
        Scanner tgb = new Scanner(System.in);
        int[] dices = new int[diceCnt];
        for (int i = 0; i < diceCnt; i++) {
            dices[i] =  (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public static int dicesSum(int[] dices) {
        int sum = 0;
        for (int dice : dices) {
            sum += dice;
        }

        return sum;
    }
}