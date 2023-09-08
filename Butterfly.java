public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3){
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
        }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
             if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3){
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
        }
        System.out.println();
        }
       //lower half 
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
             if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3){
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
        }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
             if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3){
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
        }
        System.out.println();
        }
    }
}
