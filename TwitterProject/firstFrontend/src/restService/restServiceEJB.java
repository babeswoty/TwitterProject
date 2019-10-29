package restService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import entities.SimpleObjects;

@Path("/MyRestService")
@ApplicationPath("/resources")

public class restServiceEJB extends Application{
	
	 @PersistenceContext
     private static EntityManager em;
	
	//http://localhost:8080/RestProject/resources/MyRestService/sayHello
		@GET
		@Path("/sayHello")
		public String getHelloMsg() {
		
			return "Hello World";
		}
		
		//@GET
		//@Path("/object")
		//public SimpleObjects getObject() {
		//	return new SimpleObjects(1,"Test");
		//}
		public static SimpleObjects getEntity()
		{
			return null;
			
		}
		public static void addNew(SimpleObjects SimpleObjects )
	    {
	              System.out.println("============================");
	              System.out.println(SimpleObjects .getRecipientName());
	              System.out.println(SimpleObjects .getTweetid());
	              System.out.println(SimpleObjects .getTweet());
	              System.out.println(SimpleObjects .getMsg());
	              System.out.println(SimpleObjects .getTimestamp());
	              em.persist(SimpleObjects );
	              System.out.println("============================");
	    }

}
