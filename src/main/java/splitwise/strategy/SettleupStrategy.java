package splitwise.strategy;

import splitwise.dtos.Transaction;
import splitwise.models.User;

import java.util.List;
import java.util.Map;

public interface SettleupStrategy {

    public List<Transaction> settleUpUsers(Map<User, Integer> map);
}
