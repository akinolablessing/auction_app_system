package org.ayomide.controller.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class LeaveFeedBackResponse {
private String message;
}
