package edu.miu.ea.commons.contracts;

public class UserAuthResponse extends Response {
    public UserAuthResponse(Code code, String msg, String token) {
        super(code, msg);
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;
}
