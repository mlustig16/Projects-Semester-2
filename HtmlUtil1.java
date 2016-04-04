import java.util.ArrayList;
import java.util.List;

public class HtmlUtil1 {
	// Put your CSS URL here
		private static final String CUSTOM_CSS_URL = "style"
				+ ""
				+ ""
				+ ".css";
		//private static final String CUSTOM_JS_URL = "collegeapplication.js";
		
		/**
		 * Renders out the HTML head. 
		 * @return the <head> element of the page
		 */
		public String buildHtmlHead() {
			return "<head>"
				+ 	 "<title>Young Money</title>"
				+ 	 "<link rel='stylesheet' type='text/css' href='" + CUSTOM_CSS_URL + "'/>"
//				+	 "<script src='" + CUSTOM_JS_URL + "'></script>"
				+  "</head>";
		}

		/**
		 * Renders out the header of the body. This is
		 * @param userName
		 * @return the header html
		 */
		public String buildBodyHeader() {
			return "<div id=\"aboutright\">" +
						"<h2>Who We Are</h2>" +
						"<p>This website is built for anyone who wants to learn about their personal finances and how to manage them.</p>" +
						"<p>It was created by Maude, Vlasta, and Lydia, three super awesome programmers who decided to learn about and help teach others how to manage their money.</p>" +				 
						"<a href=\"#\" id=\"closebtn\" class=\"close\">Close Me</a> </div>" +
						"<div id=\"mainpage\">" +
							"<nav id=\"right\">" +
							"<h1>YUNG MONEY</h1>" +
							"<ul id=\"navigation\">" +
								"<li><a href=\"#\">Home</a></li>" +
								"<li><a href=\"#\">My Finance</a></li>" +
								"<li><a href=\"#\">Dictionary</a></li>" +
								"<li><a href=\"#about\">About Us Option 1</a></li>" +  
							"</ul>" +
							"</nav>" +
						"</div>"+
					"</div>";
		}

		/**
		 * Creates home page.	
		 */

		/**
		 * Renders out the task form
		 * @return the task form
		 */
		public String buildTaskForm(String username, String schoolName) {
			// TODO create the task form if you have time
			return "";
		}

		/**
		 * Renders out the list of college applications
		 * @return the college applications
		 */

	}