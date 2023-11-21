/**
 *
 @author Emin on 27/02/2022
 */
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
    private OldCoffeeMachine oldVendingMachine;

    public void connect(OldCoffeeMachine oldVendingMachine) {
    this.oldVendingMachine = oldVendingMachine;
    }

    @Override
    public void chooseFirstSelection() {
    oldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
    oldVendingMachine.selectB();
    }
	
}