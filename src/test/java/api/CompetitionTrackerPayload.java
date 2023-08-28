package api;

public class CompetitionTrackerPayload {

	
public String businessCompetitor() {
		
		String pay = "{\r\n"
				+ "   \"method\":\"GetBusinessCompetitors\",\r\n"
				+ "   \"format\":\"json\",\r\n"
				+ "   \"parameters\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&SearchBusinessName=&BusinessCompetitorIDs=\",\r\n"
				+ "   \"typefields\":[\r\n"
				+ "      {\r\n"
				+ "         \"DataType\":\"AdministrationBO.BusinessCompetitorRow\",\r\n"
				+ "         \"Columns\":\"*\"\r\n"
				+ "      }\r\n"
				+ "   ],\r\n"
				+ "   \"async\":false,\r\n"
				+ "   \"host\":\"administration\",\r\n"
				+ "   \"params\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&SearchBusinessName=&BusinessCompetitorIDs=\"\r\n"
				+ "}";
				return pay;
	}


public String radarFeeds() {
	
	String pay = "{\r\n"
			+ "   \"method\":\"GetRadarFeeds\",\r\n"
			+ "   \"format\":\"json\",\r\n"
			+ "   \"parameters\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&isYou=0&BusinessCompetitorIDs=b48adf33-fd00-4520-a897-61983f66273e%2C9d2584bd-f762-4048-b919-a72212998d69%2Ca7300e2c-e4a0-4a7d-834a-33d03c85738f%2C34da2326-2c8c-443a-adb6-3d1bac3e097e%2Cf4e43bb5-762b-4f58-89cb-ab09d1a9ebe3&pageno=1&pagesize=20&SmileyScore=-1%2C0%2C1&socialFilterTypeID=1052%2C29154%2C17151%2C17152%2C29159%2C31431%2C31432%2C31433%2C31434%2C31435%2C31436%2C31446%2C31447%2C31448%2C31449%2C31450%2C31451%2C31452%2C31455%2C31558%2C31559%2C31561%2C31563%2C32612%2C32613%2C32614%2C32615%2C32616%2C32617%2C32621%2C32622%2C32623%2C32624%2C32625%2C32626%2C33646%2C33647%2C33648%2C33649%2C33650%2C33651%2C33652%2C33653%2C33654%2C33655%2C33656%2C33657%2C33658%2C33659%2C33661%2C33662%2C33663%2C33664%2C33665%2C33666%2C33667%2C33668%2C33671%2C33672%2C33673%2C33674%2C33675%2C33676%2C33677%2C33678%2C33679%2C33680%2C33681%2C33682%2C33683%2C33684%2C33685%2C33686%2C33687%2C33688%2C33689%2C33690%2C33691%2C33692%2C33693%2C33694%2C33695%2C33696%2C33697%2C33698%2C33699%2C33645%2C34797%2C34874&IsReputationCall=0&PostFilterType=1&TwitterUserName=&startDate=Mon+Jan+01+1900+00%3A01%3A00&endDate=Tue+Aug+22+2023+01%3A27%3A54\",\r\n"
			+ "   \"typefields\":[\r\n"
			+ "      {\r\n"
			+ "         \"DataType\":\"ContentRow\",\r\n"
			+ "         \"Columns\":\"*\"\r\n"
			+ "      }\r\n"
			+ "   ],\r\n"
			+ "   \"async\":false,\r\n"
			+ "   \"host\":\"dashboard\",\r\n"
			+ "   \"params\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&isYou=0&BusinessCompetitorIDs=b48adf33-fd00-4520-a897-61983f66273e%2C9d2584bd-f762-4048-b919-a72212998d69%2Ca7300e2c-e4a0-4a7d-834a-33d03c85738f%2C34da2326-2c8c-443a-adb6-3d1bac3e097e%2Cf4e43bb5-762b-4f58-89cb-ab09d1a9ebe3&pageno=1&pagesize=20&SmileyScore=-1%2C0%2C1&socialFilterTypeID=1052%2C29154%2C17151%2C17152%2C29159%2C31431%2C31432%2C31433%2C31434%2C31435%2C31436%2C31446%2C31447%2C31448%2C31449%2C31450%2C31451%2C31452%2C31455%2C31558%2C31559%2C31561%2C31563%2C32612%2C32613%2C32614%2C32615%2C32616%2C32617%2C32621%2C32622%2C32623%2C32624%2C32625%2C32626%2C33646%2C33647%2C33648%2C33649%2C33650%2C33651%2C33652%2C33653%2C33654%2C33655%2C33656%2C33657%2C33658%2C33659%2C33661%2C33662%2C33663%2C33664%2C33665%2C33666%2C33667%2C33668%2C33671%2C33672%2C33673%2C33674%2C33675%2C33676%2C33677%2C33678%2C33679%2C33680%2C33681%2C33682%2C33683%2C33684%2C33685%2C33686%2C33687%2C33688%2C33689%2C33690%2C33691%2C33692%2C33693%2C33694%2C33695%2C33696%2C33697%2C33698%2C33699%2C33645%2C34797%2C34874&IsReputationCall=0&PostFilterType=1&TwitterUserName=&startDate=Mon+Jan+01+1900+00%3A01%3A00&endDate=Tue+Aug+22+2023+01%3A27%3A54\"\r\n"
			+ "}";
			return pay;
}


public String businessCompetitorSocialData1() {
	
	String pay = "{\r\n"
			+ "   \"method\":\"GetBusinessCompetitorsSocialDataV2\",\r\n"
			+ "   \"format\":\"json\",\r\n"
			+ "   \"parameters\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&businessCompetitorID=&currentDate=2023/08/22&filter=0&businessCompetitorType=1&startDate=Mon Jan 01 1900 00:01:00&endDate=Tue Aug 22 2023 01:27:54\",\r\n"
			+ "   \"typefields\":[\r\n"
			+ "      {\r\n"
			+ "         \"DataType\":\"AdministrationBO.BusinessCompetitorsSocialDataRow\",\r\n"
			+ "         \"Columns\":\"*\"\r\n"
			+ "      }\r\n"
			+ "   ],\r\n"
			+ "   \"async\":false,\r\n"
			+ "   \"host\":\"administration\",\r\n"
			+ "   \"params\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&businessCompetitorID=&currentDate=2023/08/22&filter=0&businessCompetitorType=1&startDate=Mon Jan 01 1900 00:01:00&endDate=Tue Aug 22 2023 01:27:54\"\r\n"
			+ "}";
			return pay;
}


public String businessCompetitorSocialData2() {
	
	String pay = "{\r\n"
			+ "   \"method\":\"GetBusinessCompetitorsSocialDataV2\",\r\n"
			+ "   \"format\":\"json\",\r\n"
			+ "   \"parameters\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&businessCompetitorID=&currentDate=2023/08/22&filter=0&businessCompetitorType=&startDate=Mon Jan 01 1900 00:01:00&endDate=Tue Aug 22 2023 01:27:54\",\r\n"
			+ "   \"typefields\":[\r\n"
			+ "      {\r\n"
			+ "         \"DataType\":\"AdministrationBO.BusinessCompetitorsSocialDataRow\",\r\n"
			+ "         \"Columns\":\"*\"\r\n"
			+ "      }\r\n"
			+ "   ],\r\n"
			+ "   \"async\":false,\r\n"
			+ "   \"host\":\"administration\",\r\n"
			+ "   \"params\":\"projectID=da6596c3-907f-418b-a6ce-b83a4a09493c&businessCompetitorID=&currentDate=2023/08/22&filter=0&businessCompetitorType=&startDate=Mon Jan 01 1900 00:01:00&endDate=Tue Aug 22 2023 01:27:54\"\r\n"
			+ "}";
			return pay;
}


}
