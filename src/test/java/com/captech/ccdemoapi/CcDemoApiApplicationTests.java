package com.captech.ccdemoapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.* ;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class CcDemoApiApplicationTests {

    @LocalServerPort
    private int port ;

    @Test
    public void myTest() {
        System.out.println("Port: " + port) ;

        given()
                .log().all()
        .when()
                .get("http://localhost:" + port + "/employees")
        .then()
                .log().all() ;

    }

}
