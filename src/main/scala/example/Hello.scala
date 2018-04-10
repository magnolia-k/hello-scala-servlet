package com.example.servlet.app

import java.io._
import javax.servlet._
import javax.servlet.http._

class HelloServlet extends HttpServlet {
  override def doGet(req: HttpServletRequest, res: HttpServletResponse): Unit = {
    res.setContentType("text/html")
    
    val out = res.getWriter
    out.println("<!DOCTYPE html>")
    out.println("<h1>Hello World!")
    out.println("</body></html>")
  }
}
