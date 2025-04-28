import org.ayomide.Main;
import org.ayomide.controller.dto.request.AuctionDtoRequest;
import org.ayomide.controller.dto.response.AuctionDtoResponse;
import org.ayomide.data.model.Item;
import org.ayomide.services.AuctionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Main.class)
public class AuctionServiceTest {

    private final AuctionService auctionService;

    @Autowired
    public AuctionServiceTest(AuctionService auctionService) {
        this.auctionService = auctionService;
    }
    @Test
    public void testThatCreateAuction(){
    AuctionDtoRequest auctionDtoRequest = addAuction();
    AuctionDtoResponse auctionDtoResponse = auctionService.createAuction(auctionDtoRequest);
    assertEquals("Thanks for the time spending with us!!",auctionDtoResponse.getMessage());
    }
    public AuctionDtoRequest addAuction(){
        AuctionDtoRequest request = new AuctionDtoRequest();
        Item item = new Item();
        item.setItemId("68069a64751b724706856c06");
        request.setItem(item);
        request.setStartBid(200000.00);
        request.setStartDate(LocalDateTime.now());
        request.setEndDate(LocalDateTime.now().plusHours(2));
        return request;
    }
    @Test
    public void  testThatBidTwoItem(){
    AuctionDtoRequest request = addFirstBid();
    AuctionDtoRequest request1 = addSecondBid();
    AuctionDtoResponse response = auctionService.createAuction(request);
    AuctionDtoResponse response1 = auctionService.createAuction(request1);
        assertEquals("Thanks for the time spending with us!!",response.getMessage());
        assertEquals("Thanks for the time spending with us!!",response1.getMessage());
    }
    public AuctionDtoRequest addFirstBid(){
        AuctionDtoRequest request = new AuctionDtoRequest();
        Item item = new Item();
        item.setItemId("680e2cf69997c539d81189e5");
        request.setItem(item);
        request.setStartBid(7000.00);
        request.setStartDate(LocalDateTime.now());
        request.setEndDate(LocalDateTime.now().plusHours(3));
        return request;
    }
    public AuctionDtoRequest addSecondBid(){
        AuctionDtoRequest request = new AuctionDtoRequest();
        Item item = new Item();
        item.setItemId("680e2b19adbcb110aa9f797e");
        request.setItem(item);
        request.setStartBid(8000.00);
        request.setStartDate(LocalDateTime.now());
        request.setEndDate(LocalDateTime.now().plusHours(1));
        return request;
    }
}
