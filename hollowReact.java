public class hollowReact {
    public static void main(String[] arg){
       for(int i=1; i<=4;i++){
        for(int j=1; j<=5; j++){
            if (i==1 || j==1 || i==4 || j==5) {
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }
}