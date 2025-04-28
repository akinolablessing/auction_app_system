package org.ayomide.services;

import org.ayomide.controller.dto.request.AuctionDtoRequest;
import org.ayomide.controller.dto.response.AuctionDtoResponse;
import org.ayomide.data.model.Auction;
import org.ayomide.data.model.Item;
import org.ayomide.data.repository.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuctionService implements AuctionServiceInterface {
    @Autowired
    private AuctionRepository auctionRepository;
    @Autowired
    private ItemService itemService;


    @Override
    public AuctionDtoResponse createAuction(AuctionDtoRequest auctionDtoRequest) {
        AuctionDtoResponse auctionDtoResponse = new AuctionDtoResponse();
        Auction auction = new Auction();
        if (auctionDtoRequest.getItem() != null) {
            String itemId = auctionDtoRequest.getItem().getItemId();

            Optional<Item> optionalItem = itemService.findById(itemId);
            if (optionalItem.isPresent()) {
                auction.setItem(optionalItem.get());
            } else {
                throw new IllegalArgumentException("Item not found for the given itemId");
            }
        } else {
            throw new IllegalArgumentException("Item cannot be null");
        }
        auction.setStartBid(auctionDtoRequest.getStartBid());
        auction.setStartDate(auctionDtoRequest.getStartDate());
        auction.setEndDate(auctionDtoRequest.getEndDate());
        auctionRepository.save(auction);
        auctionDtoResponse.setMessage("Thanks for the time spending with us!!");
        return auctionDtoResponse;
    }

    @Override
    public void deleteAuction(AuctionDtoRequest auction) {
//        AuctionDtoRequest auctionDtoRequest = new AuctionDtoRequest();
//        createAuction(auctionDtoRequest);
//        auctionRepository.delete(auctionDtoRequest);
    }

    @Override
    public List<Auction> getAllAuction() {
        return auctionRepository.findAll();
    }
}
