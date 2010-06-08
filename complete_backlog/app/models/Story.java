package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Story extends  Model {
  public String title;
  public String phase;
  
  public Story(String title, String phase) {
    this.title = title;
    this.phase = phase;
  }
  
  public void moveToNextPhase() {
    if(phase.equals("onDeck")) { phase = "inProgress"; }
    else if(phase.equals("inProgress")) { phase = "done"; }
    save();
  }
}

