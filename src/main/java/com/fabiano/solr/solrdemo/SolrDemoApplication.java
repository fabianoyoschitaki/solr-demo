package com.fabiano.solr.solrdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolrDemoApplication {

    // starting solr:
    //./solr start -p 8984
    
    // creating core
    //./solr create -c Document
	public static void main(String[] args) {
		SpringApplication.run(SolrDemoApplication.class, args);
	}

}
