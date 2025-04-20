package org.ayomide.controller.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.ayomide.data.model.Item;

import java.time.LocalDateTime;
@Setter
@Getter
public class AuctionDtoResponse {
    private Item item;
    private int startBid;
    private int currentBid;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
