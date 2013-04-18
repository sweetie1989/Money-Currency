/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午2:32
 * To change this template use File | Settings | File Templates.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount*multiplier);
    }


}
