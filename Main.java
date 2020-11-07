import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InvestorManager investorManager = new InvestorManager();
        int numberOfNeededInvestors = Integer.parseInt(args[0]);

        try {
            Scanner sc = new Scanner(new File("InvestorData.csv"));
            while (sc.hasNext()) {
                String[] data = sc.next().split(",");
                investorManager.addInvestor(new Investor(data[0], data[1], Integer.parseInt(data[2])));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error while reading input Data: " + e);
        }

        List<Investor> topInvestors = investorManager.getTopInvestors(numberOfNeededInvestors);

        for (Investor investor : topInvestors) {
            System.out.println(investor.getName() + " " + investor.getId() + " " + investor.getNetWorth());

        }

    }
}
