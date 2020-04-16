/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devmobil.tp.mycontact.wsMetier;
import devmobil.tp.mycontact.data.Contact;
import devmobil.tp.mycontact.data.ContactData;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Administrator
 */
@Path("lesContact")
public class ServiceContact {
  @GET @Path("getContact/{refContact}") @Produces (MediaType.APPLICATION_JSON)
  public Contact getContactById(@PathParam ("refContact") int idContact){
return ContactData.lstContacts[idContact];
  }
  @GET @Path("getContacts") @Produces ({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  public Contact[] getAllContact(){
return ContactData.lstContacts;
}
}
