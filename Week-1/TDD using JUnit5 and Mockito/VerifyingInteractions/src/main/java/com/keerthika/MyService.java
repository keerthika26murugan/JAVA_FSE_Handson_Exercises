package com.keerthika;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        // This is the method we want to verify is called
        api.getData();
    }
}