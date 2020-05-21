package ApiAutomationProject.ApiAutomation;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class DeleteRequest {

	public static void main(String[] args) {
		Response Res=	
				 given()
				 .contentType(ContentType.JSON)
				 .when()
				 .delete ("http://localhost:3000/comments");
	}

}
