package com.example.kamalotus.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingRequest {
    @NotBlank
    private String name;
    @NotBlank(message = "Укажите номер или Телеграм")
    private String phone;
    @NotNull(message = "Выберите дату")
    private LocalDate date;
    private String comment;

}