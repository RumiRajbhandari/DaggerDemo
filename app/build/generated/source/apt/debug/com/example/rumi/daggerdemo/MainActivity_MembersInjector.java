// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.rumi.daggerdemo;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<User> userProvider;

  public MainActivity_MembersInjector(Provider<User> userProvider) {
    assert userProvider != null;
    this.userProvider = userProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<User> userProvider) {
    return new MainActivity_MembersInjector(userProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.user = userProvider.get();
  }

  public static void injectUser(MainActivity instance, Provider<User> userProvider) {
    instance.user = userProvider.get();
  }
}
