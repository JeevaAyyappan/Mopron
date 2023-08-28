package api;

public class GetFiveStarReviewPayload {

	
public String analytics() {
		
		String pay = "{\r\n"
				+ "   \"method\":\"GetTCAnalyticsData\",\r\n"
				+ "   \"format\":\"json\",\r\n"
				+ "   \"parameters\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&socialFilterTypeID=26868%2C1051%2C31432%2C17151%2C29159&startDate=Sat+May+20+2023+01%3A35%3A02&endDate=Thu+Aug+17+2023+01%3A35%3A02&searchText=&starRating=\",\r\n"
				+ "   \"typefields\":[\r\n"
				+ "      {\r\n"
				+ "         \"DataType\":\"ContentRow\",\r\n"
				+ "         \"Columns\":\"*\"\r\n"
				+ "      }\r\n"
				+ "   ],\r\n"
				+ "   \"async\":false,\r\n"
				+ "   \"host\":\"dashboard\",\r\n"
				+ "   \"params\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&socialFilterTypeID=26868%2C1051%2C31432%2C17151%2C29159&startDate=Sat+May+20+2023+01%3A35%3A02&endDate=Thu+Aug+17+2023+01%3A35%3A02&searchText=&starRating=\"\r\n"
				+ "}";
				return pay;
	}
	

public String radarFeed() {
	
	String pay = "{\r\n"
			+ "   \"method\":\"GetRadarFeedsByFilterV2\",\r\n"
			+ "   \"format\":\"json\",\r\n"
			+ "   \"parameters\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&isYou=1&BusinessCompetitorIDs=&pageno=1&pagesize=10&SmileyScore=-1%2C+0%2C+1&socialFilterTypeID=17151%2C31432%2C26868%2C29159&IsReputationCall=0&startDate=Sat+May+20+2023+18%3A50%3A50&endDate=Thu+Aug+17+2023+18%3A50%3A50&searchText=&starRating=&IsResponsed=&IsPublished=\",\r\n"
			+ "   \"typefields\":[\r\n"
			+ "      {\r\n"
			+ "         \"DataType\":\"ContentRow\",\r\n"
			+ "         \"Columns\":\"*\"\r\n"
			+ "      }\r\n"
			+ "   ],\r\n"
			+ "   \"async\":false,\r\n"
			+ "   \"host\":\"dashboard\",\r\n"
			+ "   \"params\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&isYou=1&BusinessCompetitorIDs=&pageno=1&pagesize=10&SmileyScore=-1%2C+0%2C+1&socialFilterTypeID=17151%2C31432%2C26868%2C29159&IsReputationCall=0&startDate=Sat+May+20+2023+18%3A50%3A50&endDate=Thu+Aug+17+2023+18%3A50%3A50&searchText=&starRating=&IsResponsed=&IsPublished=\"\r\n"
			+ "}";
			return pay;
}

}
