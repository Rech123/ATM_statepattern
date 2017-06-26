/**
 * Created by rashed on 6/7/2017.
 */
public interface ATMState {
    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);
}
