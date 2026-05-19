package com.restapi.global.rsData;

public record RsData<T>(String resultCode, String msg, T data) {
}
