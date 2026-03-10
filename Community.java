import java.util.ArrayList;
import java.util.Scanner;

public class Community {
    private String name;
    private ArrayList<String> factors;
    private ArrayList<Integer> weights;
    private static ArrayList<String> allCommunities = new ArrayList<>();

    Scanner slotc1 = new Scanner(System.in);

    public Community(String nameIn, ArrayList<String> factorsIn, ArrayList<Integer> weightsIn){
        name = nameIn;
        factors = new ArrayList<>(factorsIn);
        weights = new ArrayList<>(weightsIn);

        allCommunities.add(nameIn);
    }

    static public String getCommunities(){
        String output = "";
        for (int i = 0; i<allCommunities.size(); i++)
            output += allCommunities.get(i)+", ";
        return output;
    }
    static public String getCommunitiesList(){
        String output = "";
        for (int i = 0; i<allCommunities.size(); i++){
            int bro = i+1;
            output += "["+bro+"] "+allCommunities.get(i)+"\n";
        }
        return output;
    }

    public void makeEntry(int factorIndex, String name){
        ArrayList<Double> factorInputTemp = new ArrayList<Double>();
        for (int i = 0; i<factors.size(); i++){
            System.out.println("How would you rate "+name+" based on "+factors.get(factorIndex)+"? ");
            double brobro = slotc1.nextDouble();
            factorInputTemp.add(brobro);
        
        }
    }
}
