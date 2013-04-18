/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-18
 * Time: 下午9:05
 * To change this template use File | Settings | File Templates.
 */
public abstract class Money {

    protected int amount;

    //override
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount) ;
    }

    public static Money franc(int amount) {
        return new Franc(amount);

    }

    public abstract Money times(int multiplier) ;


}
