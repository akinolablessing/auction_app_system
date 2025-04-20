package org.ayomide.services;

import org.ayomide.data.model.Item;

import java.util.List;

public interface ItemServiceInterface {
    Item createItem(Item item);
    void deleteItem(Item item);
    List<Item> getAllItems();
}
