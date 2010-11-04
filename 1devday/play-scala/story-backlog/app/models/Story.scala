package models
 
import java.util._
 
import play.db.jpa._
import play.data.Validators._

@Entity
class Story(
    @Required
    var title: String,
    var phase: String

) extends Model

object Stories extends QueryOn[Story]