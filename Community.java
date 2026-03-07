import java.util.ArrayList;

public class Community {
    String name;
    ArrayList<String> factors;
    ArrayList<Integer> weights;

    public Community(String nameIn, ArrayList<String> factorsIn, ArrayList<Integer> weightsIn){
        name = nameIn;
        factors = new ArrayList<>(factorsIn);
        weights = new ArrayList<>(weightsIn);
    }
}
