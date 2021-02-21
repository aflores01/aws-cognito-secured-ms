package com.reach.dev.cognito.ms.api.response;

import com.reach.dev.cognito.ms.api.util.ToJSON;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class APIResponse implements ToJSON {

    public String messageProcessed;

}
