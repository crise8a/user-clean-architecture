package org.cat.user_clean_architecture.infrestructure.adapters.input.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
}
