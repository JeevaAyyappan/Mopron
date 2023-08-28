package api;

public class GetConnectedPayload {
	
	
	public String dashboardPost() {
		
		String pay = "{\r\n"
				+ "   \"method\":\"GetNavTabs\",\r\n"
				+ "   \"parameters\":\"ProjectID=da6596c3-907f-418b-a6ce-b83a4a09493c&UserID=8874455c-1964-410f-96d5-f98256c95265&IsPhone=false\",\r\n"
				+ "   \"typefields\":[\r\n"
				+ "      {\r\n"
				+ "         \"DataType\":\"ProjectNavTabMapRow\",\r\n"
				+ "         \"Columns\":\"*\"\r\n"
				+ "      }\r\n"
				+ "   ]\r\n"
				+ "}";
				return pay;
	}


public String userPermissionPost() {
	
	String pay = "{\r\n"
			+ "   \"method\":\"GetUser\",\r\n"
			+ "   \"format\":\"json\",\r\n"
			+ "   \"parameters\":\"UserID=8874455c-1964-410f-96d5-f98256c95265\",\r\n"
			+ "   \"typefields\":[\r\n"
			+ "      {\r\n"
			+ "         \"DataType\":\"_UserRow\",\r\n"
			+ "         \"Columns\":\"*\"\r\n"
			+ "      }\r\n"
			+ "   ],\r\n"
			+ "   \"async\":false,\r\n"
			+ "   \"host\":\"administration\",\r\n"
			+ "   \"params\":\"UserID=8874455c-1964-410f-96d5-f98256c95265\"\r\n"
			+ "}";
			return pay;

	}

public String industryPost() {
	
	String pay = "{\r\n"
			+ "   \"method\":\"GetSocialIndustry\",\r\n"
			+ "   \"format\":\"json\",\r\n"
			+ "   \"parameters\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c\",\r\n"
			+ "   \"typefields\":[\r\n"
			+ "      {\r\n"
			+ "         \"DataType\":\"*\",\r\n"
			+ "         \"Columns\":\"*\"\r\n"
			+ "      }\r\n"
			+ "   ],\r\n"
			+ "   \"async\":false,\r\n"
			+ "   \"host\":\"dashboard\",\r\n"
			+ "   \"params\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c\"\r\n"
			+ "}";
			return pay;
	}


}
