package com.example.hackmatch;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HackMatchApplication extends Application<HackMatchConfiguration> {

    public static void main(final String[] args) throws Exception {
	new HackMatchApplication().run(args);
    }

    @Override
    public String getName() {
        return "HackMatch";
    }

    @Override
    public void initialize(final Bootstrap<HackMatchConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HackMatchConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
