import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int input = sc.nextInt();
        System.out.println("The Output is "+input);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
