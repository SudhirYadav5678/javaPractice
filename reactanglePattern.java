import java.util.*;
public class reactanglePattern {
    public static void main(String[] arg){
        System.out.println("Enter your no.");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for(int i=0; i<=no; i++){
            for(int j= 0; j<=no+1; j++){
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
    }
}
