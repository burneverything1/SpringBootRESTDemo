package com.example.demo;

/* A resource representation class - a Java object with fields, constructors and accessors that will
be sent within the request.
note: this application uses the Jackson JSON library to automatically change instances of type Greeting into
JSON. Jackson is included by default by the web starter.
*/

public class Greeting {
    
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
