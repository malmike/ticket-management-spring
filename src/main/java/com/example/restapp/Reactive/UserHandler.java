package com.example.restapp.Reactive;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

public class UserHandler {
  private final UserRepository userRepository;

  public UserHandler(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Mono<ServerResponse> getAllUsers(ServerRequest request) {
    Flux<User> users = this.userRepository.getAllUsers();
    return ServerResponse.ok().contentType(APPLICATION_JSON).body(users, User.class);
  }

}
