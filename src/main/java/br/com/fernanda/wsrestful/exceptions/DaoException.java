package br.com.fernanda.wsrestful.exceptions;

public class DaoException extends RuntimeException {


    private static final long serialVersionUID;

    static {
        serialVersionUID = -5586453067070132015L;
    }

    private int code;

    public DaoException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}