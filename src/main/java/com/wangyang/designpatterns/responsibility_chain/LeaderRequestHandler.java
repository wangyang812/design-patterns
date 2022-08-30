package com.wangyang.designpatterns.responsibility_chain;

public class LeaderRequestHandler extends RequestHandler{

    @Override
    public void handleRequest(String req) {
        if ("领导".equals(req)) {
            System.out.println("领导审批");
        } else {
            super.handleRequest(req);
        }
    }
}
