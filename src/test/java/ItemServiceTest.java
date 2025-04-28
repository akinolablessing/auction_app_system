import org.ayomide.Main;
import org.ayomide.controller.dto.request.ItemDtoRequest;
import org.ayomide.controller.dto.response.ItemDtoResponse;
import org.ayomide.services.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Main.class)
public class ItemServiceTest {
    private final ItemService itemService;

    @Autowired
    public ItemServiceTest(ItemService itemService) {
        this.itemService = itemService;
    }

    @Test
    public void testThatCreateItem() {
        ItemDtoRequest itemDtoRequest = addItem();
        ItemDtoResponse itemDtoResponse = itemService.createItem(itemDtoRequest);
        assertEquals("Item Created Successful", itemDtoResponse.getMessage());
    }
    public ItemDtoRequest addItem(){
        ItemDtoRequest request = new ItemDtoRequest();
        request.setName("Wig");
        request.setDescription("I want black wig");
        request.setAmount(500000.00);
        return  request;
    }

}
