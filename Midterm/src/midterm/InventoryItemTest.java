package midterm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InventoryItemTest {

	@Test
	void testInventoryItem() {
		InventoryItem inventoryItem = new InventoryItem("Type", 50, "ItemName", 2);
		assertNotNull(inventoryItem);
	}

	@Test
	void testGetName() {
		InventoryItem inventoryItem = new InventoryItem("Type", 50, "ItemName", 2);
		assertEquals("ItemName", inventoryItem.getName());
	}

	@Test
	void testGetType() {
		InventoryItem inventoryItem = new InventoryItem("Type", 50, "ItemName", 2);
		assertEquals("Type", inventoryItem.getType());
	}

	@Test
	void testGetWeight() {
		InventoryItem inventoryItem = new InventoryItem("Type", 50, "ItemName", 2);
		assertEquals(50, inventoryItem.getWeight());
	}

	@Test
	void testGetCount() {
		InventoryItem inventoryItem = new InventoryItem("Type", 50, "ItemName", 2);
		assertEquals(2, inventoryItem.getCount());
	}

	@Test
	void testToString() {
		InventoryItem inventoryItem = new InventoryItem("Type", 50, "ItemName", 1);
		assertEquals("ItemName type (Type), wt: 50", inventoryItem.toString());
		InventoryItem inventoryItem2 = new InventoryItem("Type", 50, "ItemName", 2);
		assertEquals("ItemName type (Type), wt: 50, there are 2 left", inventoryItem2.toString());
	}

}
