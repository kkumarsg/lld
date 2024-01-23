package splitwise.strategy;

import splitwise.dtos.Transaction;
import splitwise.models.User;

import java.util.*;

public class HeapSettleStrategy implements SettleupStrategy{

    @Override
    public List<Transaction> settleUpUsers(Map<User, Integer> map) {

        PriorityQueue<Pair> receivers = new PriorityQueue<>();
        PriorityQueue<Pair> givers = new PriorityQueue<>();

        List<Transaction> transactions = new ArrayList<>();

        for(User user: map.keySet()){
            Integer amount = map.get(user);
            if(amount<0){
                givers.add(new Pair(-1*amount, user));
            }
            else if(amount>0){
                receivers.add(new Pair(amount, user));
            }
        }

        while(receivers.size()>0 && givers.size()>0){
            Pair giver = givers.poll();
            Pair receiver = receivers.poll();
            transactions.add(new Transaction(giver.user.getName(), receiver.user.getName(), giver.amount));

            if(giver.amount < receiver.amount){
                receivers.add(new Pair(receiver.amount- giver.amount, receiver.user));
            }
        }
        return transactions;
    }
}

class Pair implements Comparable {
    int amount;
    User user;

    public Pair(int amount, User user) {
        this.amount = amount;
        this.user = user;
    }

    @Override
    public int compareTo(Object o) {
        Pair other = (Pair) o;
        if(this.amount <= other.amount){
            return -1;
        }
        return 1;
    }
}
