package org.ayomide.controller;

import org.ayomide.controller.dto.request.AuctionDtoRequest;
import org.ayomide.controller.dto.response.AuctionDtoResponse;
import org.ayomide.data.model.Auction;
import org.ayomide.services.AuctionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auctions")
public class AuctionController {

  @Autowired
  private AuctionServiceInterface auctionServiceInterface;

  @PostMapping
    public AuctionDtoResponse createAuction(AuctionDtoRequest auctionDtoRequest){
      AuctionDtoRequest auction = new AuctionDtoRequest();
      auction.setItem(auctionDtoRequest.getItem());
      auction.setStartBid(auctionDtoRequest.getStartBid());
      auction.setCurrentBid(auctionDtoRequest.getCurrentBid());
      auction.setStartDate(auctionDtoRequest.getStartDate());
      auction.setEndDate(auctionDtoRequest.getEndDate());
    AuctionDtoResponse createAuction = auctionServiceInterface.createAuction(auction);

      AuctionDtoResponse auctionDtoResponse = new AuctionDtoResponse();
      auctionDtoResponse.setItem(createAuction.getItem());
      auctionDtoResponse.setStartBid(createAuction.getStartBid());
      auctionDtoResponse.setCurrentBid(createAuction.getCurrentBid());
    return auctionDtoResponse;
  }
}
