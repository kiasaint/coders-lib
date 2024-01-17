package com.codersworld.configs.rest;


public interface OnApiResponse<T> {
    void onApiSuccess(T response);
    void onApiError(String type,String error);
}
