package com.wangyang.designpatterns.responsibility_chain;

public abstract class RequestHandler {

    private RequestHandler nextRequestHandler;

    public void handleRequest(String req) {
        if (nextRequestHandler != null) {
            nextRequestHandler.handleRequest(req);
        } else {
            System.out.println("没人审批了");
        }
    }

    public static class Builder {

        private RequestHandler head;

        private RequestHandler tail;

        public RequestHandler build() {
            return this.head;
        }

        public Builder addHandler(RequestHandler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
            }
            this.tail.nextRequestHandler = handler;
            this.tail = handler;
            return this;
        }
    }

}
