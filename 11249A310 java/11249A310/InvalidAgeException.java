class invalidAgeException extends Exception {
    public invalidAgeException(String message) {
        super(message) ;
    }
}
class Voting {
    void checkAge(int age) throws invalidAgeException {
        if(age <18) {
            throw new invalidAgeException(
                "invalid age! you must be 18 or above to vote."
            );
        }
        System.out.println("you are eligible to vote.");
    }
    public static void main(String[] args) {
        Voting v=new Voting ();
        try {
           v.checkAge(16); 
        } catch (invalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

