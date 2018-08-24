package controllers

import javax.inject._
import play.api.mvc._


@Singleton
class ProjectsController @Inject()(projectTemp: views.html.projects, cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(projectTemp())
  }

  def gapMinder() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.gapminder())
  }

  def resume() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.resume())
  }
}
