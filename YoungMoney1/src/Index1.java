import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Index
 */
@WebServlet("/index1.html")

public class Index1 extends HttpServlet{	
	
	private static final long serialVersionUID = 1L;

	private HtmlUtil1 htmlUtil;
	
	public Index1(){
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String responseHtml = "";

		// Open up the HTML document with correct identifier
		responseHtml += "<!DOCTYPE html><html>";

		// Add in the header. This contains metadata about the page, and tells
		// the client about any other resources it should grab (javascript, html
		// css, etc) to successfully render this page
		responseHtml += htmlUtil.buildHtmlHead();

		// Start the body of the html document. This is where all of the visible
		// content on the page is defined
		responseHtml += "<body>";

		// Include the header. This is the content we'll put at the top of the
		// page
		responseHtml += htmlUtil.buildBodyHeader();

		// *********************************************************************
		// TODO render out the college application form
		//responseHtml += htmlUtil.buildApplicationForm();
				
		// TODO render out all the applications
		//responseHtml += htmlUtil.buildCollegeApplicationList();
		
		// TODO If you have time,render out the tasks for each application
		// *********************************************************************

		// Don't forget to close all the tags that were opened!
		responseHtml += "</body></html>";

		// Finally, let's write out the entire html string we've built to the
		// body of the http response
		response.getWriter().println(responseHtml);
	}
}



