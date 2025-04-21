package org.ayomide.services;

import org.ayomide.controller.dto.request.ItemDtoRequest;
import org.ayomide.controller.dto.response.ItemDtoResponse;
import org.ayomide.data.model.Item;
import org.ayomide.data.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService implements ItemServiceInterface{
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public ItemDtoResponse createItem(ItemDtoRequest itemDtoRequest) {
        ItemDtoResponse itemDtoResponse = new ItemDtoResponse();
        Item item = new Item();
        item.setName(itemDtoRequest.getName());
        item.setDescription(itemDtoRequest.getDescription());
        item.setAmount(itemDtoRequest.getAmount());
        itemRepository.save(item);
        itemDtoResponse.setMessage("Item Created Successful");
        return itemDtoResponse;
    }

    @Override
    public void deleteItem(ItemDtoRequest itemDtoRequest) {
//        itemRepository.delete(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
