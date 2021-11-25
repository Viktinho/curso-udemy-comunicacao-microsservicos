package br.com.cursoudemy.productapi.config.exception;

import lombok.Data;

@Data
public class ExceptionDetails {

    private int Status;
    private String message;
}
