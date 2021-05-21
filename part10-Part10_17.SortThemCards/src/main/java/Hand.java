import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }
    
    private int sumOfValues() {
        int sum = 0;
        
        for (Card card : hand) {
            sum += card.getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand handCompared) {        
        return this.sumOfValues() - handCompared.sumOfValues();
    }
}
