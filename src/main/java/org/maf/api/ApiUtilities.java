package org.maf.api;
import java.util.HashMap;

import static org.maf.api.ApiConstant.*;

public class ApiUtilities {

    public static HashMap<String, String> headers() {
        HashMap<String, String> headers;
        headers = new HashMap<>();
        headers.put("x-api-key", X_API_CODE);
        headers.put("x-market", X_MARKET);
        headers.put("Accept-Language", ACCEPT_LANGUAGE);
        return headers;
    }

    public static HashMap<String, String> headers(String accessToken) {
        HashMap<String, String> headers;
        headers = new HashMap<>();
        headers.put("x-api-key", X_API_CODE);
        headers.put("x-market", X_MARKET);
        headers.put("Accept-Language", ACCEPT_LANGUAGE);
        headers.put("Authorization", accessToken);
        return headers;
    }


    public static HashMap<String, String> headersWithSession(String sessionID) {
        HashMap<String, String> headers;
        headers = new HashMap<>();
        headers.put("x-api-key", X_API_CODE);
        headers.put("x-market", X_MARKET);
        headers.put("Accept-Language", ACCEPT_LANGUAGE);
        headers.put("X-Session-Id",sessionID );
        return headers;
    }
    public static HashMap<String, String> stringToHashmap(String[] array){
        HashMap<String, String> param = new HashMap<>();
        for (String pair: array) {
            String[] keyValue = pair.split(":");
            param.put(keyValue[0].trim(), keyValue[1].trim());
        }
        return param;
    }

}
