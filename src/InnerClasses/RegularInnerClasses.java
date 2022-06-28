package InnerClasses;

public class RegularInnerClasses {
    private String username;
    private String password;

    class vaiidateCredentials{

        public void validate(){
            System.out.println( "The username is " + username);
        }
    }

    public static void main(String[] args) {
        RegularInnerClasses run = new RegularInnerClasses();
        RegularInnerClasses.vaiidateCredentials inn = run.new vaiidateCredentials();
//        run.username = "Kelli";
        inn.validate();

    }
}
