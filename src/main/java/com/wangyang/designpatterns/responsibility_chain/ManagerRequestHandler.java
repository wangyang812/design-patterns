package com.wangyang.designpatterns.responsibility_chain;

public class ManagerRequestHandler extends RequestHandler{

    @Override
    public void handleRequest(String req) {
        if ("经理".equals(req)) {
            System.out.println("经理审批");
        } else {
            super.handleRequest(req);
        }
    }
}
