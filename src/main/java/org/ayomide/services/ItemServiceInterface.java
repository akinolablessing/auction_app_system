package org.ayomide.services;

import org.ayomide.controller.dto.request.ItemDtoRequest;
import org.ayomide.controller.dto.response.ItemDtoResponse;
import org.ayomide.data.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemServiceInterface {
    ItemDtoResponse createItem(ItemDtoRequest itemDtoRequest);
    void deleteItem(ItemDtoRequest itemDtoRequest);
    List<Item> getAllItems();
    Optional<Item> findById(String itemId);
}
