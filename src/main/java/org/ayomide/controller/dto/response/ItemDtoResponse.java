package org.ayomide.controller.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class ItemDtoResponse {
    @Id
    private String message;

}
