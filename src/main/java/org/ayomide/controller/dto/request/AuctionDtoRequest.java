package org.ayomide.controller.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.ayomide.data.model.Item;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuctionDtoRequest {


    private Item item;
    private double startBid;
    private LocalDateTime startDate;
    private LocalDateTime endDate;


}
