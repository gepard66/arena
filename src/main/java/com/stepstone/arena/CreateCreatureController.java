package com.stepstone.arena;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(path = "/createCreatures")
public class CreateCreatureController {

  private final static String CREATE_CREATURE_SERVICE_URL = "http://localhost:8080";

  private RestTemplate restTemplate = new RestTemplate();


//  @RequestMapping(method = RequestMethod.GET, path = "/createCreatures")
//  public ResponseEntity<Creature> createCreature(@PathVariable(value = "index") Integer index) {
//    return restTemplate.getForEntity(CREATE_CREATURE_SERVICE_URL + "?index=" + index, int.class);
//  }

}
