package Org.Testing.Payloads;

public class PojoSimpleBody {
	
	public static PojoBodyData GetBodyData() {
		
		PojoBodyData data = new PojoBodyData();
		data.setFirstName("Arshbir");
		data.setLastName("Singh");
		data.setAge(9);
		data.setProfession("Student");
		data.setId(999);
		return data;
		
	}
}