package utility;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;


public abstract class BaseTest extends FrameworkUtility {

 public static RequestSpecification requestSpec;
 public static ResponseSpecification responseSpec;

    @BeforeClass
    public void setBaseURI() {

        AllureLogger.logToAllure("The base URI is : "+ FrameworkUtility.readConfigurationFile("Base_URI"));
        requestSpec = new RequestSpecBuilder().
                setBaseUri(FrameworkUtility.readConfigurationFile("Base_URI")).
                build();

    }

    /*****************************************************************************************************************/
//	@AfterSuite
    public void afterSuite() {

    }

    /****************************************************************************************************************/
//	@BeforeClass
    public void beforeClass() {
    }

    /****************************************************************************************************************/
//	@AfterClass
    public void afterClass(){

    }

    /************************************************************************************************************************/
@BeforeClass
    public void beforeMethod() {
        responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();
    }

    //	@AfterMethod
    public void afterMethod() {

    }

}
/*****************************************************************************************************************/