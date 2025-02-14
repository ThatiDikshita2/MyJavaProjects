package collections;
 import java.util.Map;
 import java.util.TreeMap;
//TreeMap
// to store key and value pair
 //ordered based on based keys
 // null values are not allowed
	public class TreeMapDemo {

			public static void main(String[] args) {
				TreeMap<String, Integer> hm = new TreeMap<>();
				hm.put("JFS", 400);
				hm.put("PFS", 400);
				hm.put("MEAN", 400);
				hm.put("MERN", 400);
				System.out.println(hm);

				hm.put("JFE", 500);
				System.out.println(hm);
				
				//null key is not allowed.leads to npe
				//hm.put(null,100);
				//System.out.println(hm);
				
				hm.put("Angular", null);
				System.out.println(hm);
				
				System.out.println(hm.keySet());
				System.out.println(hm.values());
				System.out.println(hm.entrySet());

				for (Map.Entry<String, Integer> entry : hm.entrySet()) {
					System.out.println(entry);
				}
			}
}

