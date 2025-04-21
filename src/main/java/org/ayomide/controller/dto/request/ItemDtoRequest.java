package org.ayomide.controller.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDtoRequest {
    private String name;
    private String description;
    private double amount;
}
