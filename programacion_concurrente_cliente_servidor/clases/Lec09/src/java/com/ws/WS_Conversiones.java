package com.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WS_Conversiones")
public class WS_Conversiones {

    private final float conversion = 583.1f;

    @WebMethod(operationName = "colToDol")
    public double colToDol(@WebParam(name = "Colones") double colones) {
        return colones / conversion;
    }

    @WebMethod(operationName = "dolToCol")
    public double dolToCol(@WebParam(name = "Dolares") double dolares) {
        return dolares * conversion;
    }
}
