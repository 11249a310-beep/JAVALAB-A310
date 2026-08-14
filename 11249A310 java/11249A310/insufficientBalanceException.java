class insufficientBalanceException extends Exception{
    public insufficientBalanceException(String message) {
        super(message);
    }
}
class ATM {
    double balance=5000;
    void withdraw(double amount) throws insufficientBalanceException{
        if(amount>balance) {
            throw new insufficientBalanceException(
                "Insufficient balance ! Available balance:" +balance
                );
        }
        balance =balance-amount;
        System.out.println("withdrawal sucessfully.");
        System.out.println("Remaining balance:" + balance);
    }
    public static void main(String[] args) {
        ATM atm=new ATM() ;
        try { 
            atm.withdraw(7000);  
        } catch (insufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }  
}