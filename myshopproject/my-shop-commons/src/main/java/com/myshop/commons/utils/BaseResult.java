package com.myshop.commons.utils;

import java.io.Serializable;

public class BaseResult implements Serializable
{
    private static int SUCCESS_STATUS = 200;

    private static int ERROR_STATUS = 500;

    private int status;

    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static BaseResult success (BaseResult baseResult)
    {
        return BaseResult.createResult(baseResult, SUCCESS_STATUS, "success.");
    }

    public static BaseResult success (BaseResult baseResult, String message)
    {
        return BaseResult.createResult(baseResult, SUCCESS_STATUS, message);
    }

    public static BaseResult fail (BaseResult baseResult)
    {
        return BaseResult.createResult(baseResult, ERROR_STATUS, "error.");
    }

    public static BaseResult fail (BaseResult baseResult, String message)
    {
        return BaseResult.createResult(baseResult, ERROR_STATUS, message);
    }

    public static BaseResult fail (BaseResult baseResult, int status, String message)
    {
        return BaseResult.createResult(baseResult, status, message);
    }

    private static BaseResult createResult (BaseResult baseResult, int status, String message)
    {
        baseResult.setStatus(status);
        baseResult.setMessage(message);

        return baseResult;
    }
}
