package datamappersamples;

public class delete {

	public static void main(String[] args) {
		
		java.util.HashMap<String,String> map1 = new java.util.HashMap<String, String>();
		map1.put ("keyData", "testing1");
		map1.put("ValueData", "test2");

		java.util.HashMap<String,String> map2 = new java.util.HashMap<String, String>();
		map2.put ("keyData", "testing3");
		map2.put("ValueData", "test4");

		java.util.List<java.util.Map<String, String>> data = new java.util.ArrayList<java.util.Map<String, String>>();
		data.add(map1);
		data.add(map2);
	}
}
