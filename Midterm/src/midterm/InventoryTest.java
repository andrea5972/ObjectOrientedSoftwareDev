package midterm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InventoryTest {

	@Test
	void testInventory() {
		Inventory inventory = new Inventory();
		assertNotNull(inventory);
	}

	@Test
	void testAddItemToInventory() {
		Inventory inventory = new Inventory();
		InventoryItem inventoryItem = new InventoryItem("", 10, "", 2);
		assertTrue(inventory.addItemToInventory(inventoryItem));
		assertEquals(inventory.items.get(0), inventoryItem);
		InventoryItem inventoryItem1 = new InventoryItem("", 500, "", 2);
		assertFalse(inventory.addItemToInventory(inventoryItem1));
	}

	@Test
	void testDropInventoryItem() {
		Inventory inventory = new Inventory();
		InventoryItem inventoryItem = new InventoryItem("", 10, "", 2);
		assertTrue(inventory.addItemToInventory(inventoryItem));
		assertTrue(inventory.dropInventoryItem(inventoryItem));
		assertFalse(inventory.dropInventoryItem(inventoryItem));
	}

	@Test
	void testGetWeight() {
		Inventory inventory = new Inventory();
		assertEquals(inventory.getWeight(), 0);
		InventoryItem inventoryItem1 = new InventoryItem("", 10, "", 2);
		InventoryItem inventoryItem2 = new InventoryItem("", 20, "", 2);
		inventory.addItemToInventory(inventoryItem1);
		assertEquals(inventory.getWeight(), 10);
		inventory.addItemToInventory(inventoryItem2);
		assertEquals(inventory.getWeight(), 30);
	}

	@Test
	void testGetCount() {
		Inventory inventory = new Inventory();
		assertEquals(inventory.getCount(), 0);
		InventoryItem inventoryItem1 = new InventoryItem("", 10, "", 2);
		InventoryItem inventoryItem2 = new InventoryItem("", 20, "", 2);
		inventory.addItemToInventory(inventoryItem1);
		inventory.addItemToInventory(inventoryItem2);
		assertEquals(inventory.getCount(), 2);
		inventory.dropInventoryItem(inventoryItem2);
		assertEquals(inventory.getCount(), 1);
	}
}
