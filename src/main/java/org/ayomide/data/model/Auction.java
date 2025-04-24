package org.ayomide.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
@Getter
@Setter
public class Auction {
    @Id
    private  String autionId;
    private Item item;
    private Long startBid;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
