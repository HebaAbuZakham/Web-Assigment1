package org.maf.api;

public class ApiConstant {

    private static final String SANDBOX_URL;
    private static final String DEV_URL;
    public static final String PRODUCTLIST_API;
    public static final String X_API_CODE;
    public static final String X_MARKET;
    public static final String ACCEPT_LANGUAGE;
    public static final int SUCCESS;
    public static final String CATEGORY;
    public static final String CATEGORY_VALUE;
    public static final String SORTING;
    public static final String PRICE;
    public static final String DATE_ADDED;
    public static final String INVALID_SORT_OPTION;
    public static final String DIRECTION;
    public static final String DESC;
    public static final String ASC;
    public static final String PAGE;
    public static final int PAGE_ONE;
    public static final String LIMIT;
    public static final int LIMIT_VALUE;
    public static final int PAGE_TWO;
    public static final int LIMIT_51;
    public static final int ERROR_422;
    public static final int PAGE_MINUS;
    public static final String  CHARACTER;
    public static final String  COLOR;
    public static final String  SIZE;
    public static final int ERROR_401;
    public static final int ERROR_404;
    public static final String ADD_TO_CART_API ;
    public static final String TOKEN;
    public static final String GET_USER_INFO_API;
    public static final String EMAIL;
    public static final String EMAIL_VALUE;
    public static final String Session_API;
    public static final String PRODUCT_BY_ID_API;
    public static final String STORE_BY_ID_API;

    static {



        SANDBOX_URL = "https://maf-holding-sandbox.apigee.net/marketplace";
        DEV_URL= "https://maf-holding-dev.apigee.net/marketplace";
        PRODUCTLIST_API = DEV_URL +"/store/49/products";
        X_API_CODE = "HxGV9rfgRrz5mAkhASYzxfDgrOHVp71Z";
        X_MARKET = "moe";
        ACCEPT_LANGUAGE = "en-gb";
        SUCCESS = 200;
        CATEGORY = "category";
        CATEGORY_VALUE= "25";
        SORTING = "sorting";
        DIRECTION = "direction";
        DESC = "desc";
        ASC = "desc";
        PRICE = "price";
        PAGE = "page";
        LIMIT = "limit";
        PAGE_ONE= 1;
        LIMIT_VALUE = 1;
        PAGE_TWO= 2;
        LIMIT_51 = 51;
        ERROR_422 = 422;
        PAGE_MINUS= -1;
        CHARACTER = "";
        COLOR= "color";
        SIZE= "size";
        DATE_ADDED= "date_added";
        INVALID_SORT_OPTION= "invalid sort option";
        ERROR_401 = 401;
        ERROR_404 = 404;
        ADD_TO_CART_API = DEV_URL +"/cart";
        TOKEN = "";
        GET_USER_INFO_API = DEV_URL + "/auth0/user";
        EMAIL= "email";
        EMAIL_VALUE= "muna.abuyounes@maf.ae";
        Session_API= DEV_URL + "/sessions";
        PRODUCT_BY_ID_API = DEV_URL+"/product/262";
        STORE_BY_ID_API= DEV_URL+"/store/63";

    }
}
