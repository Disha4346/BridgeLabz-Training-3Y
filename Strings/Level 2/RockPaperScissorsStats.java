// L2-Q9: Rock-Paper-Scissors vs Computer with stats
// File: RockPaperScissorsStats.java
import java.util.*;

public class RockPaperScissorsStats {
    static String[] choices = {"rock","paper","scissors"};

    public static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return choices[r];
    }

    public static int result(String user, String comp) {
        if (user.equals(comp)) return 0; // draw
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        return -1;
    }

    public static String[][] stats(int games, Scanner sc) {
        int uw=0, cw=0, d=0;
        String[][] rows = new String[games + 2][4]; // user, comp, winner, pct row later
        for (int i = 0; i < games; i++) {
            System.out.print("Your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            int res = result(user, comp);
            String win;
            if (res == 1) { uw++; win="User"; }
            else if (res == -1) { cw++; win="Computer"; }
            else { d++; win="Draw"; }
            rows[i][0] = user; rows[i][1] = comp; rows[i][2] = win; rows[i][3] = "";
        }
        int total = uw+cw+d;
        rows[games][0] = "UserWins"; rows[games][1] = String.valueOf(uw);
        rows[games][2] = "CompWins"; rows[games][3] = String.valueOf(cw);
        rows[games+1][0] = "UserWin%"; rows[games+1][1] = String.format("%.2f", (uw*100.0)/total);
        rows[games+1][2] = "CompWin%"; rows[games+1][3] = String.format("%.2f", (cw*100.0)/total);
        return rows;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games? ");
        int n = sc.nextInt();
        String[][] table = stats(n, sc);
        System.out.println("User	Comp	Winner	Info");
        for (String[] r : table) System.out.println((r[0]==null?"":r[0]) + "	" + (r[1]==null?"":r[1]) + "	" + (r[2]==null?"":r[2]) + "	" + (r[3]==null?"":r[3]));
        sc.close();
    }
}
