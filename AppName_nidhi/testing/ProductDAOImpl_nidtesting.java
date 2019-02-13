
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.takehome.bean.Product_nid;
import com.capgemini.takehome.dao.*;



public class ProductDAOImpl_nidtesting {
	private IProductDAO_nid daoRef;

	//@Test
	public void test()
    {
		fail("Not yet implemented");
	 }


	@Before
	public void setup() {
		 System.out.println("Setting up dao object");
		daoRef = new IProductDAO_nid();
		
	}	
	
	//create
	@Test
	public void test1() {
		
		Product_nid pro=new Product_nid();
		pro.setId(10);
		pro.setName("nidhi");
		pro.setCategory("asd" );
		
		boolean flag= daoRef.create(pro);
	
		assertTrue(flag);
	}
	@After
	public void varification()
	{
		System.out.println("Cleaning up dao object");
		daoRef=null;
	}
}
	
		
	
	