/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gab
 */
@WebService(serviceName = "TestWebService")
public class TestWebService {

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        return true;
    }
}
