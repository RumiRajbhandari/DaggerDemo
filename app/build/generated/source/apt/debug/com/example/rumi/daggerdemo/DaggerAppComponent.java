// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.example.rumi.daggerdemo;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<User> getUser1Provider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<User2> getUser2Provider;

  private MembersInjector<SubActivity> subActivityMembersInjector;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getUser1Provider =
        DoubleCheck.provider(UserModule_GetUser1Factory.create(builder.userModule));

    this.mainActivityMembersInjector = MainActivity_MembersInjector.create(getUser1Provider);

    this.getUser2Provider =
        DoubleCheck.provider(UserModule2_GetUser2Factory.create(builder.userModule2));

    this.subActivityMembersInjector =
        SubActivity_MembersInjector.create(getUser1Provider, getUser2Provider);
  }

  @Override
  public void inject(MainActivity mainActivity) {
    mainActivityMembersInjector.injectMembers(mainActivity);
  }

  @Override
  public void inject(SubActivity subActivity) {
    subActivityMembersInjector.injectMembers(subActivity);
  }

  public static final class Builder {
    private UserModule userModule;

    private UserModule2 userModule2;

    private Builder() {}

    public AppComponent build() {
      if (userModule == null) {
        this.userModule = new UserModule();
      }
      if (userModule2 == null) {
        this.userModule2 = new UserModule2();
      }
      return new DaggerAppComponent(this);
    }

    public Builder userModule(UserModule userModule) {
      this.userModule = Preconditions.checkNotNull(userModule);
      return this;
    }

    public Builder userModule2(UserModule2 userModule2) {
      this.userModule2 = Preconditions.checkNotNull(userModule2);
      return this;
    }
  }
}
