import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class InvestorManager {

    PriorityQueue<Investor> investorQueue;

    public InvestorManager() {
        investorQueue = new PriorityQueue<Investor>(new InvestorComparator());
    }

    public void addInvestor(Investor investor) {
        investorQueue.add(investor);
    }

    public Investor removeInvestor() {
        return investorQueue.poll();
    }

    public List<Investor> getTopInvestors(int numberOfInvestors) {
        List<Investor> topInvestors = new ArrayList<>();
        while (numberOfInvestors > 0) {
            if (investorQueue.size() > 0) {
                topInvestors.add(investorQueue.poll());
            }
            numberOfInvestors--;
        }
        investorQueue.addAll(topInvestors);
        return topInvestors;
    }


    public PriorityQueue<Investor> getInvestorQueue() {
        return investorQueue;
    }

    public void setInvestorQueue(PriorityQueue<Investor> investorQueue) {
        this.investorQueue = investorQueue;
    }

}
