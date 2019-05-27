package org.dreambot.dreambot_quickstart;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(author = "John Brown",
        name = "My Test Script",
        version = 1.0,
        description = "My script description",
        category = Category.MINING)
public class Main extends AbstractScript {

    public void onStart() {
        log("Script started :)");
    }

    public void onExit() {
        log("Script stopped :(");
    }

    @Override
    public int onLoop() {
        log("Hello, world!");
        return Calculations.random(1000, 2000);
    }
}