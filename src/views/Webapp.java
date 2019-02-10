package views;

import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class Webapp extends DynamicWebPage
{
	public Webapp(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
        if(toProcess.path.equalsIgnoreCase("webapp.html"))
        {
        	//Lab 1 Task 4
        	//Change this string so that it contains HTML from a page you created in Pingendo 
        	String stringToSendToWebBrowser = "<!DOCTYPE html>\n" + 
        			"<html>\n" + 
        			"\n" + 
        			"<head>\n" + 
        			"  <meta charset=\"utf-8\">\n" + 
        			"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + 
        			"  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n" + 
        			"  <link rel=\"stylesheet\" href=\"https://static.pingendo.com/bootstrap/bootstrap-4.2.1.css\">\n" + 
        			"</head>\n" + 
        			"\n" + 
        			"<body >\n" + 
        			"  <nav class=\"navbar navbar-expand-md navbar-light\">\n" + 
        			"    <div class=\"container\"> <a class=\"navbar-brand text-primary\" href=\"#\">\n" + 
        			"        <i class=\"fa d-inline fa-lg fa-stop-circle\"></i>\n" + 
        			"        <b> BRAND</b>\n" + 
        			"      </a> <button class=\"navbar-toggler navbar-toggler-right border-0\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar4\">\n" + 
        			"        <span class=\"navbar-toggler-icon\"></span>\n" + 
        			"      </button>\n" + 
        			"      <div class=\"collapse navbar-collapse\" id=\"navbar4\">\n" + 
        			"        <ul class=\"navbar-nav ml-auto\">\n" + 
        			"          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">Features</a> </li>\n" + 
        			"          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">Pricing</a> </li>\n" + 
        			"          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">About</a> </li>\n" + 
        			"          <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">FAQ</a> </li>\n" + 
        			"        </ul> <a class=\"btn navbar-btn ml-md-2 btn-light\">Contact us</a>\n" + 
        			"      </div>\n" + 
        			"    </div>\n" + 
        			"  </nav>\n" + 
        			"  <div class=\"py-0 pt-3\">\n" + 
        			"    <div class=\"container-fluid\">\n" + 
        			"      <div class=\"row\">\n" + 
        			"        <div class=\"col-md-2\"><img class=\"img-fluid d-block p-1 mx-2 img-thumbnail mx-auto\" src=\"https://static.pingendo.com/img-placeholder-1.svg\" width=\"150\" height=\"300\"></div>\n" + 
        			"        <div class=\"col-md-5\">\n" + 
        			"          <div class=\"row\">\n" + 
        			"            <div class=\"col-md-12\">\n" + 
        			"              <h1 class=\"text-left\">PLAYLIST NAME</h1>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"          <div class=\"row text-right\">\n" + 
        			"            <div class=\"col-md-12\">\n" + 
        			"              <h2 class=\"\">User Name goes here</h2>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"        </div>\n" + 
        			"        <div class=\"col-md-2\"><img class=\"img-fluid d-block rounded-circle p-1 mx-2 mr-3\" src=\"https://static.pingendo.com/img-placeholder-1.svg\" width=\"150\n" + 
        			"100\n" + 
        			"100\" height=\"300\"></div>\n" + 
        			"        <div class=\"col-md-3 bg-light\">\n" + 
        			"          <div class=\"row\"></div>\n" + 
        			"          <div class=\"row\"></div>\n" + 
        			"          <div class=\"row\">\n" + 
        			"            <div class=\"col-md-12\">\n" + 
        			"              <h1 class=\"\" style=\"\">User Comments</h1>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"        </div>\n" + 
        			"      </div>\n" + 
        			"    </div>\n" + 
        			"  </div>\n" + 
        			"  <div class=\"py-0\">\n" + 
        			"    <div class=\"container-fluid\">\n" + 
        			"      <div class=\"row\">\n" + 
        			"        <div class=\"col-md-9\" style=\"\">\n" + 
        			"          <div class=\"row\" style=\"\">\n" + 
        			"            <div class=\"col-md-2\" style=\"\">\n" + 
        			"              <h4 class=\"\">Track. No</h4>\n" + 
        			"              <h4 class=\"\">Track. No</h4>\n" + 
        			"              <h4 class=\"\">Track. No</h4>\n" + 
        			"              <h4 class=\"\">Track. No</h4>\n" + 
        			"              <h4 class=\"\">Track. No</h4>\n" + 
        			"              <h4 class=\"\">Track. No</h4>\n" + 
        			"              <h4 class=\"\">Track. No</h4>\n" + 
        			"            </div>\n" + 
        			"            <div class=\"col-md-10\" style=\"\">\n" + 
        			"              <p class=\"lead\">Song Name goes here&nbsp;</p>\n" + 
        			"              <p class=\"lead\">Song Name goes here&nbsp;</p>\n" + 
        			"              <p class=\"lead\">Song Name goes here&nbsp;</p>\n" + 
        			"              <p class=\"lead\">Song Name goes here&nbsp;</p>\n" + 
        			"              <p class=\"lead\">Song Name goes here&nbsp;</p>\n" + 
        			"              <p class=\"lead\">Song Name goes here&nbsp;</p>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"        </div>\n" + 
        			"        <div class=\"col-md-3 bg-light\">\n" + 
        			"          <div class=\"row\">\n" + 
        			"            <div class=\"col-md-12\">\n" + 
        			"              <p class=\"pl-0\">Paragraph. Then, my friend, when darkness overspreads my eyes, and heaven and earth seem to dwell in my soul and absorb its power, like the form of a beloved mistress, then I often think with longing.</p>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"          <div class=\"row\">\n" + 
        			"            <div class=\"col-md-3\"><img class=\"img-fluid d-block rounded-circle\" src=\"https://static.pingendo.com/img-placeholder-3.svg\" width=\"50\"></div>\n" + 
        			"            <div class=\"col-md-9\">\n" + 
        			"              <p class=\"\" contenteditable=\"true\">Username</p>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"          <div class=\"row\">\n" + 
        			"            <div class=\"col-md-12\">\n" + 
        			"              <p class=\"pl-0\">Paragraph. Then, my friend, when darkness overspreads my eyes, and heaven and earth seem to dwell in my soul and absorb its power, like the form of a beloved mistress, then I often think with longing.</p>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"          <div class=\"row\">\n" + 
        			"            <div class=\"col-md-3\"><img class=\"img-fluid d-block rounded-circle\" src=\"https://static.pingendo.com/img-placeholder-3.svg\" width=\"50\"></div>\n" + 
        			"            <div class=\"col-md-9\">\n" + 
        			"              <p class=\"\" contenteditable=\"true\">Username</p>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"        </div>\n" + 
        			"      </div>\n" + 
        			"    </div>\n" + 
        			"  </div>\n" + 
        			"  <div class=\"py-0\">\n" + 
        			"    <div class=\"container-fluid\">\n" + 
        			"      <div class=\"row pt-2\">\n" + 
        			"        <div class=\"col-md-9\">\n" + 
        			"          <div class=\"row\" style=\"\"></div>\n" + 
        			"        </div>\n" + 
        			"        <div class=\"col-md-3 bg-light\">\n" + 
        			"          <div class=\"row\">\n" + 
        			"            <div class=\"col-md-12\">\n" + 
        			"              <form class=\"form-inline\">\n" + 
        			"                <div class=\"input-group\">\n" + 
        			"                  <input type=\"text\" class=\"form-control\" placeholder=\"Leave a Comment\">\n" + 
        			"                  <div class=\"input-group-append\"><button class=\"btn btn-primary\" type=\"button\" contenteditable=\"true\">Comment</button></div>\n" + 
        			"                </div>\n" + 
        			"              </form>\n" + 
        			"            </div>\n" + 
        			"          </div>\n" + 
        			"        </div>\n" + 
        			"      </div>\n" + 
        			"    </div>\n" + 
        			"  </div>\n" + 
        			"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n" + 
        			"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n" + 
        			"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n" + 
        			"  <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo Free&nbsp;&nbsp;<img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\"></pingendo>\n" + 
        			"</body>\n" + 
        			"\n" + 
        			"</html>";
        	
        	toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );
//
        	return true;
        }
        return false;
	}

}