//Ethan Tang 4B

import java.util.Scanner;

public class ArraySolution {
    public static Scanner input = new Scanner(System.in);
    public static String [][] output={
        {"In woods you hear a twig snap, press 0 to run away and 1 to investigate?"},
        {"You run away successfully, press 0 to go home and 1 to go deeper into the woods?", "You discover the presence of another creature, press 0 to befriend the creature and 1 to attack it"},
        {"**You enjoy a peaceful but hungry day in cave", "Press 0 to look for prey and 1 to look for berries", "**The creature shares its food, and you go home fed", "**You were mauled to death"},
        {"You find prey, press 0 to attempt to catch it and 1 to wait.", "In the woods you find two kinds of berries press 0 to pick the purple one and 1 to pick the teal one"},
        {"**Prey captured, you go home fed","**Prey runs away, you die hungry","**You go home fed","**You consumed a poison berry and died"}
    };
    public static int depth=0;
    public static int position=0;
    public static void main(String[] args) {
        while (!output[depth][position].startsWith("**")){
            System.out.println(output[depth][position]);
            depth+=1;
            int offset=0;
            try{
                offset=Integer.parseInt(input.nextLine()) ;
                if (offset<0 || offset>1){
                    throw new NumberFormatException();
                }
            }catch(NumberFormatException e){
                System.out.println("Enter either 0 or 1");
            }
            if (depth>0){
                int stop=(position+1)/2-1;
                int total=0;
                for (int i = 0; i <= stop; i++) {
                    if (output[depth-1][i].contains("**")){
                        total=total+2;
                        stop-=1;
                    }
                }
                position=position+position+offset-total;
            }else{
                position=position+offset;
            }       
        }

        System.out.println(output[depth][position].substring(2));
    }
}
