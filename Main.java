import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static boolean program = false; // true is on; false is off

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       

        ArrayList<Community> communities = new ArrayList<Community>();

        System.out.println("[OVATION]\nRate anything");
        program = true;
        while (program == true) {
            System.out.println(
                    "Options:\n[a] create a community\n[b] make an entry\n[c] view communities\n[d] view entries");
            String option = scan.nextLine();
            System.out.println();
            if (option.equals("a")) {
                ArrayList<String> factorNames = new ArrayList<String>();
                ArrayList<Integer> communityWeights = new ArrayList<Integer>();

                // name the community 
                System.out.println("Community name: ");
                String communityName = scan.nextLine();
                System.out.println();
                
                //number of factors
                System.out.println("# of factors (max: 10)");
                int numFactors = scan.nextInt();
                scan.nextLine();
                System.out.println();

                //name the factors
                System.out.println("Name each of the factors: ");
                if (numFactors <= 10 && numFactors > 0) {
                    for (int i = 0; i < numFactors; i++) {
                        System.out.print("Factor #" + (i + 1) + ": ");
                        String factorName = scan.nextLine();
                        factorNames.add(factorName);
                    }
                } else {
                    System.out.println("Please input a number between 1 and 10 inclusive");
                }
                System.out.println();

                //weigh the factors
                System.out.println("Out of 10, weigh each factor's importance");
                for (int i = 0; i < numFactors; i++) {
                    System.out.print(factorNames.get(i)+"'s weight: ");
                    int weight = scan.nextInt();
                    communityWeights.add(weight);
                }

                Community newCommunity = new Community(communityName, factorNames, communityWeights);
                communities.add(newCommunity);

                System.out.println();
                System.out.println();
            } else if (option.equals("b")) {
                System.out.println(Community.getCommunitiesList());
                System.out.print("For which community? ");         
                int communityPick = scan.nextInt();
                scan.nextLine();                                
                System.out.println();                              
                System.out.print("Name the entry: ");              
                String entryName = scan.nextLine();                  

                System.out.println();
                System.out.println();
            } else if (option.equals("c")) {
                System.out.println(Community.getCommunities());
                
                System.out.println();
                System.out.println();
            } else if (option.equals("d")) {
                System.out.println("entry 1, entry 2, entry 3");
            } else {
                System.out.print("Invalid option");
                System.out.println();
            }
        }
    }
}


