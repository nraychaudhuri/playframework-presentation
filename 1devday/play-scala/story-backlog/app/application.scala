package controllers
 
import play._
import play.mvc._
import models._
 
object Application extends Controller {
  def index = {
    val stories = Stories.find("order by id desc").fetch()
    render(stories)
  }
  
  def createStory(title: String) = {
    val story = new Story(title, "deck")
    renderJSON(story.save())
  }
}