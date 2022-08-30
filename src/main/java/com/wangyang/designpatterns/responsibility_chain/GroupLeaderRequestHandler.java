package com.wangyang.designpatterns.responsibility_chain;

public class GroupLeaderRequestHandler extends RequestHandler {

    @Override
    public void handleRequest(String req) {
        if ("组长".equals(req)) {
            System.out.println("组长审批");
        } else {
            super.handleRequest(req);
        }
    }
}
