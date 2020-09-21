package com.example.restapp.Reactive;

import reactor.core.publisher.Flux;

public interface UserRepository {
  Flux<User> getAllUsers();
}
