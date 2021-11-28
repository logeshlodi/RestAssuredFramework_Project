package Org.Testing.Payloads;

public class PojoSimpleUpdatedData {
	
	public static PojoBodyData GetUpdatedBodyData( ) {
		
		PojoBodyData data = new PojoBodyData();
		data.setFirstName("Logesh");
		data.setLastName("Lodi");
		data.setAge(9);
		data.setProfession("IT");
		data.setId(2011);
		
		return data;
		
	}

}
