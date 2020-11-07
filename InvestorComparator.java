import java.util.Comparator;

public class InvestorComparator implements Comparator<Investor> {

    @Override
    public int compare(Investor investor1, Investor investor2) {
        if (investor1.getNetWorth() < investor2.getNetWorth())
            return 1;
        else if (investor1.getNetWorth() > investor2.getNetWorth())
            return -1;
        else
            return 0;
    }

}
