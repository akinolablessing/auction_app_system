package org.ayomide.controller;

import org.ayomide.controller.dto.request.AuctionDtoRequest;
import org.ayomide.controller.dto.response.AuctionDtoResponse;
import org.ayomide.data.model.Auction;
import org.ayomide.services.AuctionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auctions")
public class AuctionController {

  @Autowired
  private AuctionServiceInterface auctionServiceInterface;
//
//  @PostMapping
//    public ResponseEntity<?> createAuction(AuctionDtoRequest auctionDtoRequest){
//
//
//  }
}
