import java.util.HashMap;
import java.util.List;

public class Pair {

 HashMap<List<Integer>,Double> hash_d;
    HashMap<List<Integer>,List<Integer>> hash_l;


    public Pair(HashMap<List<Integer>,Double> d,HashMap<List<Integer>,List<Integer>> l  ){
      this.hash_d=d;
      this.hash_l=l;
    }

    public HashMap<List<Integer>,Double> getHash_d(){
        return this.hash_d;
    }

    public HashMap<List<Integer>,List<Integer>> getHash_l(){
        return this.hash_l;
    }


}
