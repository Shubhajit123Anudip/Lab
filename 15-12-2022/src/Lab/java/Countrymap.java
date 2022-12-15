package Lab.java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

	public class Countrymap {
			private HashMap<String,String> M1;
			
			public Countrymap() {
				M1=new HashMap<String,String>();
			}
			public HashMap<String,String>storeCountryCapital(String CountryName,String capital){
				M1.put(CountryName, capital);
				return M1;}
			public String getCapital(String CountryName) {
				return M1.get(CountryName);
			}
	public String retrieveCapital(String CountryName) {
		Set<Entry<String ,String>> set = M1.entrySet();
		Iterator<Entry<String,String>> it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			if(me.getValue().equals(CountryName))
				return me.getKey();
		}
		  return null;
	}
	public HashMap<String,String> swapKeyValue(){
	   HashMap<String,String> M2 = new HashMap<String,String>();
	   Set<Entry<String,String>> set=M1.entrySet();
	   Iterator<Entry<String,String>> it=set.iterator();
	   while(it.hasNext()) {
		   Map.Entry<String,String> me =it.next();
		   M2.put(me.getValue(),me.getKey());
	   }
	   return M2;
	}
	public ArrayList<String> toArrayList(){
		ArrayList<String> list =new ArrayList<>();
		Set<Entry<String,String>> set=M1.entrySet();
		Iterator<Entry<String,String>> it=set.iterator();
		while(it.hasNext()) {
		Map.Entry<String,String>me=it.next();	
		list.add(me.getKey());
		}
		return list;
	}
	public static void main(String[]args) {
		Countrymap countryMap=new Countrymap();
		System.out.println(countryMap.storeCountryCapital("India","Delhi"));
		System.out.println(countryMap.storeCountryCapital("Japan","Tokyo"));
		System.out.println(countryMap.storeCountryCapital("USA","Washington DC"));
		System.out.println(countryMap.storeCountryCapital("Paris","London"));
	   
		System.out.println(countryMap.retrieveCapital("India"));
		System.out.println(countryMap.retrieveCapital("Tokyo"));
		//System.out.println(countryMap.toarrayList());
		
		HashMap<String,String> M2 =countryMap.swapKeyValue();
		System.out.println(M2);
	}
	}


