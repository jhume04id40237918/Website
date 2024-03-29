package views;

import java.util.List;

import org.h2.mvstore.MVMap;

import views.PageElements;
import model.Product;
import storage.DatabaseInterface;
import storage.FileStoreInterface;
import web.WebRequest;
import web.WebResponse;

public class Store extends DynamicWebPage
{
	public Store(DatabaseInterface db,FileStoreInterface fs)
	{
		super(db,fs);
	}

	public boolean process(WebRequest toProcess)
	{
		if(toProcess.path.equalsIgnoreCase("store"))
		{				
			String username = toProcess.cookies.get("username"); 
			String password = toProcess.cookies.get("password"); 

			MVMap<String, Product> products = db.s.openMap("products");
			List<String> productKeys = products.keyList();

			if (productKeys.size() == 0) {
				Product tshirt = new Product();
				tshirt.filePathToImage = "../images/tshirt1.png"; 
				tshirt.description = "Our first ever T-Shirt! When we decided to open our merch store we thought of three principles; clean, striking and affordable. So why not cop a Straight T-Shirt today. Sizes: S, M, L, XL"	;
				tshirt.price = "9.99";
				tshirt.uniqueid = "product_"+System.currentTimeMillis();
				tshirt.title = "Straight T-Shirt";
				tshirt.paypalBtn = "BNY7ML6LGKLDN";
				products.put(tshirt.uniqueid, tshirt);
				db.commit();
			}


			String stringToSendToWebBrowser ="";
			//start of html and imports of materialize cs
			//navbar
			if(username!=null)
			{
				stringToSendToWebBrowser = PageElements.header()+
						"\r\n" + 
						"<body >\r\n" +
				PageElements.NavBarLoggedIn(toProcess);
				
			}
			else {
				stringToSendToWebBrowser = PageElements.header()+
						"\r\n" + 
						"<body >\r\n" +
				PageElements.Navbar();
				
			}


			//Carousel
			stringToSendToWebBrowser +=
					"<div class=\"carousel carousel-slider\">\r\n" + 
							"    <div class=\"carousel-fixed-item\">\r\n" + 
							"      <a href=\"#tshirts\">\r\n" + 
							"        <h2 class=\"black-text\">Store</h2>\r\n" + 
							"      </a>\r\n" + 
							"      <h5 class=\"black-text\">Support our emotion based music site <br /> and look damn good doing it! </h5>\r\n" + 
							"\r\n" + 
							"    </div>\r\n" + 

							"    <a class=\"carousel-item\">\r\n" + 
							"      <img src=\"../images/sampleDeal.png\">\r\n" + 
							"    </a>\r\n" + 
							"    <a class=\"carousel-item\" href=\"#two!\">\r\n" + 
							"      <img src=\"../images/sampleDeal2.png\">\r\n" + 
							"    </a>\r\n" + 
							"  </div>" + 
							"<div class=\"container\">\r\n" + 
							"\r\n" + 
							"<div class=\"grid-container\">\r\n" + 
							"      <div class=\"item1\">\r\n" + 
							"        \r\n" + 
							"      </div>\r\n" + 
							"      <div class=\"item2\">\r\n" + 
							"        <h2 class = center>Products</h2>\r\n" + 
							"      </div>\r\n" + 
							"      <div class=\"item3\">\r\n" + 
							"        \r\n" + 
							"      </div>"; 

			for (int i = 0; i < productKeys.size(); i++) {
				String productUniqueID = productKeys.get(i);
				Product product = products.get(productUniqueID);
				

				stringToSendToWebBrowser += "<div class=\"item"+i+4+"\">\r\n" + 
						"        <div class=\"row\">\r\n" + 
						"          <div class=\"col s12 m7\">\r\n" + 
						"            <a href=\"productpage?prodID="+productUniqueID+"\">\r\n" + 
						"<div class=\"card hoverable\">\r\n" + 
						"              <div class=\"card-image\">\r\n" + 
						"                <img src=\""+product.filePathToImage+"\">\r\n" + 
						"              </div>\r\n" + 
						"              <div class=\"card-content\">\r\n" + 
						"                <h5 class = \"black-text\">"+product.title+"</h5>\r\n" +
						"<p class = \"black-text\">Average review: <b>"+product.avgReview()+"/5</b> ("+product.reviews.size()+")</p>\r\n" +
						"              </div>\r\n" + 
						"              <div class=\"card-action\">\r\n" + 
						"                <h6 class = \"black-text\">Only &pound"+product.price+"</h6>\r\n" + 
						"              </div>\r\n" + 
						"            </div></a>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div>"; 
			}
			stringToSendToWebBrowser += "</div>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"\r\n" + 
					"    </div>\r\n" + 
					"    <br><br>\r\n" + 
					"  </div>\r\n" + 
					"\r\n";
			//This is the footer
			stringToSendToWebBrowser += PageElements.footer();
			//Scripts
			stringToSendToWebBrowser += PageElements.scripts();
			//End
			stringToSendToWebBrowser +=
					"  </body>\r\n" + 
							"</html>\r\n"; 


			toProcess.r = new WebResponse( WebResponse.HTTP_OK, WebResponse.MIME_HTML, stringToSendToWebBrowser );

			return true;
		}

		return false;
	}


}
