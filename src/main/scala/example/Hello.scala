package com.example.servlet.app

import java.io._
import javax.servlet._
import javax.servlet.http._

class HelloServlet extends HttpServlet {
  override def service(req: HttpServletRequest, res: HttpServletResponse): Unit = {
    if (req.getMethod == "GET" && req.getPathInfo == "/") {

      res.setContentType("text/html")

      val name = Option(req.getParameter("name")) match {
        case None    => "Wolrd"
        case Some(p) => p
      }

      val out = res.getWriter
      out.println("<!DOCTYPE html>")
      out.println("<html><body>")
      out.println(s"<h1>Hello, $name")
      out.println("</body></html>")

    } else {

      res.sendError(HttpServletResponse.SC_NOT_FOUND)

    }
  }
}
