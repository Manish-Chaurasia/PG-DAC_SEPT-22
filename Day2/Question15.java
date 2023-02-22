import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Question15{
	
	public static void main(String[] args){
		
		int[] arr = {10,20,10,30,10,40,10,50};
		System.out.println(mostFreq(arr));
	}
	
	public static int mostFreq(int[] a){
		
		Map<Integer , Integer> hp = new HashMap<Integer , Integer>();
		
		for(int i=0;i<a.length;i++){
			int key = a[i];
			if(hp.containsKey(key)){
				int num = hp.get(key);
				num++;
				hp.put(key , num);
			}
			else{
				hp.put(key , 1);
			}
		}
		
		int countMax = 0;
		int result = -1;
		for(Entry<Integer , Integer> val : hp.entrySet()){
			if(countMax < val.getValue()){
				result = val.getKey();
				countMax = val.getValue();
			}
		}
		return result;
	}
}