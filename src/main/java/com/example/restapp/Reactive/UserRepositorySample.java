package com.example.restapp.Reactive;

import reactor.core.publisher.Flux;

import java.util.HashMap;
import java.util.Map;

public class UserRepositorySample implements UserRepository {

  private Map<Integer, User> users = new HashMap<>();

  public UserRepositorySample() {
    this.users.put(100, new User(100, "David"));
    this.users.put(101, new User(101, "John"));
    this.users.put(102, new User(102, "Kevin"));
  }
  
  @Override
  public Flux<User> getAllUsers() {
    return Flux.fromIterable(this.users.values());
  }

}
