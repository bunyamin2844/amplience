package stepDefinitions.apiStepDefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pojo.UserData;
import pojo.UserDataLombok;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class Amplience_API {

    Response response;
    @Test
    void json() {
        RestAssured.baseURI="https://api.github.com/users/";


        response= given()
                .contentType(ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("login_Url")+ConfigurationReader.getProperty("user_ID"));
        response.prettyPrint();


        String responseBody = response.getBody().asString();
        JsonPath json = new JsonPath(responseBody);

        Assertions.assertEquals(json.get("name"),"Gregory Loscombe");

        Assertions.assertEquals(json.getInt("id"),15330);
        Assertions.assertEquals(json.getString("location"),"Manchester");

        Assertions.assertEquals(json.getInt("public_repos"),6);
        Assertions.assertEquals(json.getInt("public_gists"),11);
        Assertions.assertEquals(json.getInt("followers"),20);
        Assertions.assertEquals(json.getInt("following"),34);

        //******
        Assertions.assertEquals(response.getContentType(),"application/json; charset=utf-8");
        Assertions.assertEquals(response.getStatusCode(),200);
        Assertions.assertEquals(response.getHeader("Content-Length"),String.valueOf(464));




    }

    @Test
    void hamcrestMatcher() {

        given()
                .contentType(ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("login_Url")+ConfigurationReader.getProperty("user_ID"))
                .then()
                .assertThat()
                .statusCode(200)
                .body("name", equalTo("Gregory Loscombe"),
                        "id",equalTo(15330),
                        "location",equalTo("Manchester"),
        "public_repos",equalTo(6),
        "public_gists",equalTo(11),
        "followers",equalTo(20),
        "following",equalTo(34))
                .header("Content-Length",equalTo("464"))
                .time(lessThan(4000L))
                .contentType("application/json; charset=utf-8");



    }

    // POJO 1
    @SneakyThrows // exception annotation instead of try cath
    @Test
    void objectMapper() {


        response= given()
                .contentType(ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("login_Url")+ConfigurationReader.getProperty("user_ID"));


        ObjectMapper op= new ObjectMapper();

       UserDataLombok userDataLombok;


       userDataLombok =op.readValue(response.asString(), UserDataLombok.class);

        Assertions.assertEquals("Gregory Loscombe", userDataLombok.getName());

        Assertions.assertEquals(15330, userDataLombok.getId());
        Assertions.assertEquals("Manchester", userDataLombok.getLocation());
        Assertions.assertEquals(20, userDataLombok.getFollowers());

        Assertions.assertEquals(response.getContentType(),"application/json; charset=utf-8");
        Assertions.assertEquals(response.getStatusCode(),200);
        Assertions.assertEquals(response.getHeader("Content-Length"),String.valueOf(464));


    }

    // POJO 2
    @SneakyThrows
    @Test
    void jsonSchema() {



        response= given()
                .contentType(ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("login_Url")+ConfigurationReader.getProperty("user_ID"));



        ObjectMapper mapper= new ObjectMapper();

        UserData userData ;


        userData =mapper.readValue(response.asString(), UserData.class);

        Assertions.assertEquals("Gregory Loscombe", userData.getName());

        Assertions.assertEquals(15330, userData.getId());
        Assertions.assertEquals("Manchester", userData.getLocation());
        Assertions.assertEquals(20, userData.getFollowers());


        Assertions.assertEquals(response.getContentType(),"application/json; charset=utf-8");
        Assertions.assertEquals(response.getStatusCode(),200);
        Assertions.assertEquals(response.getHeader("Content-Length"),String.valueOf(464));

    }
}

