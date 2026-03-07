import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static boolean program = false; //true is on; false is off
    public static void main(String[] args){
        Scanner optionInput = new Scanner(System.in);
        Scanner communityNameInput = new Scanner(System.in);
        Scanner numFactorsInput = new Scanner(System.in);
        Scanner factorNameInput = new Scanner(System.in);

        ArrayList<String> factorNames = new ArrayList<String>();

        System.out.println("[OVATION]\nRate anything");
        program = true;
        while (program == true){
            System.out.println("Options:\n[a] create a community\n[b]make an entry\n[c] view communities\n[d] view entries");
            String option = optionInput.nextLine();
            if (option.equals("a")){
                System.out.println("Community name: ");
                String communityName = communityNameInput.nextLine();

                System.out.println("# of factors (max: 10)");
                int numFactors = numFactorsInput.nextInt();
                if (numFactors <= 10 && numFactors > 0){
                    for (int i = 0; i < numFactors; i++){
                    System.out.println("Factor #"+(i+1)+": ");
                    String factorName = factorNameInput.nextLine();
                    factorNames.add(factorName);
                    }
                } else {
                    System.out.println("Please input a number between 1 and 10 inclusive");
                }
                

                System.out.println();
                System.out.println();
            } else if(option.equals("b")){
                System.out.println("entry made");
                System.out.println();
            } else if(option.equals("c")){
                System.out.println("community 1, community 2, community 3");
                System.out.println();
            } else if(option.equals("d")){
                System.out.println("entry 1, entry 2, entry 3");
                System.out.println();
            } else {
                System.out.print("Invalid option");
                System.out.println();
            }
        }
    }
}
