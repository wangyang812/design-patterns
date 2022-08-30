package com.wangyang.designpatterns.responsibility_chain;

public class Test {

    public static void main(String[] args) {
        RequestClient requestClient = new RequestClient();
        requestClient.makeRequest("经理");
    }
}
