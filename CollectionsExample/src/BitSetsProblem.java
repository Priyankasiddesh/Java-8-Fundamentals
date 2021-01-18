import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class BitSetsProblem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int setSize=sc.nextInt();
        int NoOfOperations=sc.nextInt();
        BitSet[] bitsets=new BitSet[]{new BitSet(setSize),new BitSet(setSize)};
        Map<String,BiConsumer<Integer,Integer>> map=new HashMap<>();
        map.put("AND",(index1,index2)->bitsets[index1-1].and(bitsets[index2-1]));
        map.put("OR",(index1,index2)->bitsets[index1-1].or(bitsets[index2-1]));
        map.put("XOR",(index1,index2)->bitsets[index1-1].xor(bitsets[index2-1]));
        map.put("SET",(index1,index2)->bitsets[index1-1].set(index2));
        map.put("FLIP",(index1,index2)->bitsets[index1-1].flip(index2));

        for(int i=0;i<NoOfOperations;i++){
            map.get(sc.next()).accept(sc.nextInt(),sc.nextInt());
            System.out.println(bitsets[0].cardinality()+" "+bitsets[1].cardinality());
            
        }
    }
}