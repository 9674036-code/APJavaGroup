import java.util.Scanner;

public class MethodChallenge01 {
    public static Scanner input = new Scanner(System.in);
    public static String [][] output={
        {"start"},
        {"choice 1", "choice 2"},
        {"choice 1", "choice 2", "choice 1`", "choice 2`"}
    };
    public static int depth=0;
    public static int position=0;
    public static void main(String[] args) {
        while (depth!=output.length-1){
            System.out.println(output[depth][position]);
            depth+=1;
            int offset;
            try{
            offset=Integer.parseInt(input.nextLine()) ;
            if (offset<0|offset>1){
                throw new NumberFormatException();
            }
            position=position+offset;
            }catch(NumberFormatException e){
                System.out.println("Enter either 0 or 1");
            }

        }
        System.out.println(output[depth][position]);
    }
}
