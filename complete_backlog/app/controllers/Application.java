package controllers;

import play.mvc.*;
import java.util.*;
import models.*;

public class Application extends Controller {

    public static void index() {
      List<Story> onDeck = Story.find("byPhase", "onDeck").fetch();
      List<Story> inProgress = Story.find("byPhase", "inProgress").fetch();
      List<Story> done = Story.find("byPhase", "done").fetch();
      render(onDeck, inProgress, done);
    }
    
    public static void createStory(String title) {
      Story s = new Story(title, "onDeck").save();
      renderJSON(s);
    }
    
    public static void changeStatus(Long storyId) {
      Story story = Story.findById(storyId);
      story.moveToNextPhase();
      index();
    }
}