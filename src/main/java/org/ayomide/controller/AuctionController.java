package org.ayomide.controller;

import org.ayomide.controller.dto.request.AuctionDtoRequest;
import org.ayomide.controller.dto.response.ApiResponse;
import org.ayomide.controller.dto.response.AuctionDtoResponse;
import org.ayomide.controller.dto.response.ItemDtoResponse;
import org.ayomide.services.AuctionService;
import org.junit.platform.engine.reporting.ReportEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@AllArgsConstructor
@RequestMapping("/api/auction")
public class AuctionController {
    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }
    @PostMapping("/startAuction")
    public ResponseEntity<?> startAuction(@RequestBody AuctionDtoRequest auctionDtoRequest){
        try {
            AuctionDtoResponse auctionDtoResponse = auctionService.createAuction(auctionDtoRequest);
            return new ResponseEntity<>(new ApiResponse(true, auctionDtoResponse), HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
