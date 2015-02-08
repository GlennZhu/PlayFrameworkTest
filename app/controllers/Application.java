package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result test(String input) {
        List<String> output = new ArrayList<String>(){{add("Test testa input: " + input);}};
        JsonNode json = Json.toJson(output);
        return ok(json);
    }

}
