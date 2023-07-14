package com.NagarjunaReddy.librarymanagementproject.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StudentResponseDto {
    private int id;
    private String name;
    private String email;
}
