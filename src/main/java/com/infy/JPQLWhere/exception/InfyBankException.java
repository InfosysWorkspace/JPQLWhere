package com.infy.JPQLWhere.exception;

import java.io.Serial;

public class InfyBankException extends  Exception{

    @Serial
    private static final long serialVersionUID = 1L;

    public InfyBankException (String message){
        super(message);
    }
}
