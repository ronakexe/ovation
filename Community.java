import java.util.ArrayList;

public class Community {
    private String name;
    private ArrayList<String> factors;
    private ArrayList<Integer> weights;
    private static ArrayList<String> allCommunities = new ArrayList<>();

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

}
