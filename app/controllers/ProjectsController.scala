package controllers

import javax.inject._
import play.api.mvc._


@Singleton
class ProjectsController @Inject()(projectTemp: views.html.projects, cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Create an Action to render an HTML page.
    *
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(projectTemp())
  }
}
