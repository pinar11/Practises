import java.util.Scanner;
public class Login {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String userName, password, npassword;
        int response;

        System.out.print("Please enter your username: ");
        userName= input.nextLine();

        System.out.print("Please enter your password: ");
        password=input.nextLine();

        if(userName.equals("Patika") && password.equals("Java123")) {
            System.out.print("Login successful");
        }else {
            System.out.println("Username or password Icorrect");

            System.out.println("Would you like to reset the password: 1-Yes, 2-No");
            response=input.nextInt();
            switch (response) {
                case 1:
                    System.out.print("Please enter your new password:" + input.nextLine());
                    npassword= input.nextLine();

                    if(npassword.equals("Java123") || npassword.equals("password")){
                        System.out.print("Please try another password:  ");
                    }else{
                        System.out.println("Password is created.");
                    }
                case 2:
                    System.out.print("New password has not been created:  ");
                    break;
                default:
                    System.out.println("Please make a choice!");
                    break;
            }}}}




