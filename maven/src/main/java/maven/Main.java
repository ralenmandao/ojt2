package maven;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;

import com.eviware.soapui.impl.wsdl.WsdlInterface;
import com.eviware.soapui.impl.wsdl.WsdlOperation;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.support.wsdl.WsdlImporter;
import com.eviware.soapui.model.iface.Operation;
import com.eviware.soapui.support.SoapUIException;

public class Main {

	public static void main(String[] args) throws Exception {
		WsdlProject project = new WsdlProject();
        WsdlInterface[] wsdls = WsdlImporter.importWsdl(project, "http://developer.ebay.com/webservices/finding/latest/FindingService.wsdl");
        WsdlInterface wsdl = wsdls[0];
        int x = 0;
        
        WsdlOperation op = (WsdlOperation) wsdl.getOperationAt(0);
        System.out.println("\n\n\n");
        //System.out.println("OP:"+op.getName());
        System.out.println(op.createRequest(true));
        System.out.println("\n\n\n");
        System.out.println("Response:");
        System.out.println(op.createResponse(true));
	}

}
