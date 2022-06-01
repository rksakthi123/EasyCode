import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class APIAutomation {
	
	@Test
	public void testGetApiCall() {
		RequestSpecification request=RestAssured.given();
		request.baseUri("http://tul1mdq1rrm01:8095/v1/daq/ingestcopytypexref?sourceId=25675");
		Response response=request.get("http://tul1mdq1rrm01:8095/v1/daq/ingestcopytypexref?sourceId=25675");
		System.out.println(response.asPrettyString());
	}
	

}
