package com.wangyang.designpatterns.responsibility_chain;


public class RequestClient {

    private RequestHandler requestHandler;

    public RequestClient() {
        requestHandler = buildRequestHandler();
    }

    private RequestHandler buildRequestHandler() {
        return new RequestHandler.Builder()
                .addHandler(new GroupLeaderRequestHandler())
                .addHandler(new ManagerRequestHandler())
                .addHandler(new LeaderRequestHandler())
                .build();
    }

    public void makeRequest(String req) {
        requestHandler.handleRequest(req);
    }
}
