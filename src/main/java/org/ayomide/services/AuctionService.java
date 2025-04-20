package org.ayomide.services;

import org.ayomide.controller.dto.request.AuctionDtoRequest;
import org.ayomide.controller.dto.response.AuctionDtoResponse;
import org.ayomide.data.model.Auction;
import org.ayomide.data.repository.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionService implements AuctionServiceInterface {
    @Autowired
    private AuctionRepository auctionRepository;


    @Override
    public AuctionDtoResponse createAuction(AuctionDtoRequest auctionDtoRequest) {
//       return auctionRepository.save(auction);
    }

    @Override
    public void deleteAuction(AuctionDtoRequest auction) {
//         auctionRepository.delete(auction);
    }

    @Override
    public List<Auction> getAllAuction() {
        return auctionRepository.findAll();
    }
}
