import java.util.*;
public class ifSwitch {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        //switch
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            
            case 2:
                System.out.println("Namaste");
                break;  
            case 3:
                System.out.println("Suhdir");
                break;  
            default:System.out.println("Wrong");
                break;
        }
    }
};
