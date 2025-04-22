package org.ayomide.controller;

import org.ayomide.controller.dto.request.ItemDtoRequest;
import org.ayomide.controller.dto.request.RegisterUserRequest;
import org.ayomide.controller.dto.response.ApiResponse;
import org.ayomide.controller.dto.response.ItemDtoResponse;
import org.ayomide.controller.dto.response.RegisterUserResponse;
import org.ayomide.services.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@AllArgsConstructor
@RequestMapping("/api/item")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @PostMapping("/add-items")
    public ResponseEntity<?> addItem(@RequestBody ItemDtoRequest itemDtoRequest){
        try {
            ItemDtoResponse response =  itemService.createItem(itemDtoRequest);
            return new ResponseEntity<>(new ApiResponse(true, response), HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
