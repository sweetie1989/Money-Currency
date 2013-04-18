/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午8:29
 * To change this template use File | Settings | File Templates.
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount*multiplier);
    }
}
