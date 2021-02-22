package com.reach.dev.cognito.ms.api.request;

import com.reach.dev.cognito.ms.api.util.ToJSON;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class APIRequest implements ToJSON {

    public String message;

}
