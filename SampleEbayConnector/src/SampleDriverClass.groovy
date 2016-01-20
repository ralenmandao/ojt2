import com.ebay.sdk.ApiContext
import com.ebay.sdk.ApiCredential
import com.ebay.sdk.helper.ConsoleUtil

class SampleDriverClass {
	ApiContext getApiContext(){
		String input
		ApiContext context = new ApiContext()
		ApiCredential cred = context.getApiCredential()
		input = ConsoleUtil.readString("Enter your Ebay authentication token! : ")
		cred.seteBayToken(input)
		apiContext.setApiServerUrl("https://api.ebay.com/wsapi")
		return apiContext
	}
	
	static void main(args){
		SampleDriverClass driver = new SampleDriverClass()
		ApiContext context = driver.getApiContext();
		context
	}
}
