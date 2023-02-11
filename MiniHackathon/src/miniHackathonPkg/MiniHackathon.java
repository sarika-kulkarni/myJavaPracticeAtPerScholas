package miniHackathonPkg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MiniHackathon {
    public static void main(String[] args) {
    	miniHackathon m = new miniHackathon();
    	m.loadVendorData();
    }
    // this is what the vendor (Crufty-Clunky code Inc) has provided
    // loadVendorData() method as a starting point.
    //
    // here are the fields required for a Customer Object:
    
    //
    //"first_name",
    //"last_name",
    //"company_name",
    //"address",
    //"city",
    //"county",
    //"state",
    //"zip",
    //"phone1",
    //"phone2",
    //"email",
    //"web"
    //
    // Our requirements are:
    // Create  Customer objects, populate them  and utilize one of the
    // Java collection class data structures ( ArrayList or LinkedList for example) to
    // hold the Customer objects then
    //
    // provide a simple lookup (use Scanner obj) as stated in this part of the BRD,
    // that will take a Last_name as input.
    //
    // Place Order (Customer)
    //  2.The system displays the customer's information: name, street, city, zip, phone, email.
    //    given input will be last_name.
    void loadVendorData()
    {	
       // please map this file to your drive
       String file = "/home/lou1/Downloads/us-500.csv";
       String line;
       try (BufferedReader br =
            new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
            	System.out.println(line);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    private String first_name;
    private String last_name;
    private String company_name;
    private String address;
    private String city;
    private String county;
    private String state;
    private String zip;
    private String phone1;
    private String phone2;
    private String email;
    private String web;

    public Customer(String first_name, String last_name, String company_name, String address, String city, String county, String state, String zip, String phone1, String phone2, String email, String web) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.company_name = company_name;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.web = web;
    }
}

