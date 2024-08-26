package com.app;

import com.amazonaws.services.lambda.runtime.Context;

public class UserNamePrintHandler {

    public String handleUser(String userName, Context context){
        context.getLogger().log("hello user  "+ userName);
        return "welcome user in aws lambda "+userName;
    }
}
