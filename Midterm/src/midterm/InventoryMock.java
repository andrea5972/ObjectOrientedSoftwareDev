package midterm;

import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


class InventoryMock {

	private Inventory objTest;
	
	@BeforeEach
	void setUp() throws Exception{
		setObjTest(new Inventory());
	}
	
	@Test
	void testInventory() {
		Inventory i1 = Mockito.mock(Inventory.class);
		Inventory i2 = Mockito.mock(Inventory.class);
		
		Mockito.when(i1.getCount()).thenReturn(2);
		Mockito.when(i2.getCount()).thenReturn(2);
	}

	public Inventory getObjTest() {
		return objTest;
	}

	public void setObjTest(Inventory objTest) {
		this.objTest = objTest;
	}
	
	@Test
	void testInventorySpy() {
		Inventory spy = Mockito.spy(objTest);
		Mockito.doReturn(3).when(spy).getCount();
		int ret = spy.getCount();
		int expected = 3;
		
		assertEquals(expected, ret);
		
		Mockito.verify(spy, Mockito.times(3)).getCount();
	}
	
}
