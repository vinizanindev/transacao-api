package com.viniciuszanin.transacao_api.controller.dtos;


import java.time.OffsetDateTime;

public record TransacaoRequestDTO(Double valor, OffsetDateTime dataHora) {
}
