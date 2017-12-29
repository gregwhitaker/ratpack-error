package com.github.gregwhitaker.ratpack.error;

import com.google.inject.AbstractModule;
import ratpack.error.ClientErrorHandler;
import ratpack.error.ServerErrorHandler;

/**
 * Guice module that wires up the global error handler.
 */
public class ErrorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ClientErrorHandler.class).to(GlobalErrorHandler.class);
        bind(ServerErrorHandler.class).to(GlobalErrorHandler.class);
    }
}
