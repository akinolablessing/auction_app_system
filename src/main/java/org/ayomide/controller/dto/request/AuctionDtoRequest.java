package org.ayomide.controller.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.ayomide.data.model.Item;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuctionDtoRequest {
    private Item item;
    private int startBid;
    private int currentBid;
    private LocalDateTime startDate;
    private LocalDateTime endDate;


}
