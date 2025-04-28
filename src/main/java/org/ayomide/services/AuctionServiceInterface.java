package org.ayomide.services;

import org.ayomide.controller.dto.request.AuctionDtoRequest;
import org.ayomide.controller.dto.response.AuctionDtoResponse;
import org.ayomide.data.model.Auction;

import java.util.List;

public interface AuctionServiceInterface {
     AuctionDtoResponse createAuction(AuctionDtoRequest auctionDtoRequest);
     void deleteAuction(AuctionDtoRequest auctionDtoRequest);
    List<Auction> getAllAuction();

}
