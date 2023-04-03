package enums;

public enum ENDPOINTS {

    GIT_URL("https://github.com/")

    ;

    private  String endPoint;


    ENDPOINTS(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }
}
