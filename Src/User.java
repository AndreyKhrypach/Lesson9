public class User {
    private String name;
    Acount acount;
    public User(String name, String password) {
        this.name = name;
        acount = new Acount(password);
    }

    public User(String name) {
        this.name = name;
    }

    class Acount{
        String password;

        public Acount(String password) {
            this.password = password;
        }
    }

    // check name in method
    //public void setAccount (String password){
    public void setAccount (String pswd){

        class Account{
            String password;
            Account(){
                password = pswd;
            }
            void display(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}
